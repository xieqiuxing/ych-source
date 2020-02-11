package com.xqx.small.enroll.api.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONArray;
import com.xqx.ych.common.constans.MQEnums;
import com.xqx.ych.common.constans.TradeEnums;
import com.xqx.ych.common.exception.YchException;
import com.xqx.ych.common.protocol.coupon.ChangeCouponStatusReq;
import com.xqx.ych.common.protocol.coupon.ChangeCouponStatusRes;
import com.xqx.ych.common.protocol.coupon.QueryCouponReq;
import com.xqx.ych.common.protocol.coupon.QueryCouponRes;
import com.xqx.ych.common.protocol.enroll.ConfirmEnrollReq;
import com.xqx.ych.common.protocol.enroll.ConfirmEnrollRes;
import com.xqx.ych.common.protocol.major.ChangeMajorNumberReq;
import com.xqx.ych.common.protocol.major.ChangeMajorNumberRes;
import com.xqx.ych.common.protocol.major.QueryOrgMajorReq;
import com.xqx.ych.common.protocol.major.QueryOrgMajorRes;
import com.xqx.ych.common.protocol.mq.CancelEnrollMQ;
import com.xqx.ych.common.rocketmq.TradeMQProducer;
import com.xqx.ych.common.util.IDGenerator;
import com.xqx.ych.entity.Enroll;
import com.xqx.ych.entity.MqProducerTemp;
import com.xqx.ych.mapper.EnrollMapper;
import com.xqx.ych.mapper.MqProducerTempMapper;
import com.xqx.ych.small.api.ICouponApi;
import com.xqx.ych.small.api.IEnrollApi;
import com.xqx.ych.small.api.IMajorApi;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.SendStatus;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
@Slf4j
public class EnrollApiImpl implements IEnrollApi {
    @Resource
    private EnrollMapper enrollMapper;
    @Reference
    private IMajorApi iMajorApi;
    @Reference
    private ICouponApi iCouponApi;
    @Resource
    private TradeMQProducer tradeMQProducer;

    @Resource
    private MqProducerTempMapper mqProducerTempMapper;

    @Override
    public int addEnroll(Enroll enroll) {
        int result = enrollMapper.insert(enroll);
        return result;
    }

    @Override
    public ConfirmEnrollRes confirmEnrollStatus(ConfirmEnrollReq confirmEnrollReq) {
        ConfirmEnrollRes confirmEnrollRes = new ConfirmEnrollRes();
        confirmEnrollRes.setRetCode(TradeEnums.RetEnum.SUCCESS.getCode());
        confirmEnrollRes.setRetInfo(TradeEnums.RetEnum.SUCCESS.getDesc());
        try {
            //得到当前商品的状态
            QueryOrgMajorReq queryOrgMajorReq = new QueryOrgMajorReq();
            queryOrgMajorReq.setId(confirmEnrollReq.getId());
            final QueryOrgMajorRes queryOrgMajorRes = iMajorApi.queryOrgMajorById(queryOrgMajorReq);
            if (queryOrgMajorRes.getRetCode().equals(TradeEnums.RetEnum.FAIL.getCode())) {
                confirmEnrollRes.setRetCode(TradeEnums.RetEnum.FAIL.getCode());
                confirmEnrollRes.setRetInfo(TradeEnums.RetEnum.FAIL.getDesc());
            }
            //1.参数校验
            checkConfirmOrderReq(confirmEnrollReq, queryOrgMajorRes);
            //2.创建不可以见订单
            String enrollId = saveNoConfirmOrder(confirmEnrollReq);
            confirmEnrollRes.setEnrollId(enrollId);
            //3.调用远程服务 扣优惠券 减少专业招生名额  -->调用成功 ，更改报名状态为可见；失败，发送MQ消息取消报名
            callRemoService(confirmEnrollReq, enrollId);
            //TODO 改进3  返回订单id
            confirmEnrollRes.setEnrollId(enrollId);
        } catch (Exception e) {
            confirmEnrollRes.setRetCode(TradeEnums.RetEnum.FAIL.getCode());
            confirmEnrollRes.setRetInfo(TradeEnums.RetEnum.FAIL.getDesc());

            e.printStackTrace();
        }
        return confirmEnrollRes;
    }

    /**
     * 调用远程服务：扣优惠券，扣库存，扣余额
     *
     * @param confirmEnrollReq
     */
    private void callRemoService(ConfirmEnrollReq confirmEnrollReq, String enrollId) {
        try {
            //扣代金券
            if (StringUtils.isNotBlank(confirmEnrollReq.getCouponId())) {
                ChangeCouponStatusReq changeCouponStatusReq = new ChangeCouponStatusReq();
                changeCouponStatusReq.setEnrollId(enrollId);
                changeCouponStatusReq.setIsUsed(TradeEnums.YesNoEnum.YES.getCode());
                changeCouponStatusReq.setCouponId(confirmEnrollReq.getCouponId());

                final ChangeCouponStatusRes changeCouponStatusRes = iCouponApi.changeCouponStatus(changeCouponStatusReq);
                if (changeCouponStatusReq == null || changeCouponStatusRes.getRetCode().equals(TradeEnums.RetEnum.FAIL.getCode())) {
                    throw new YchException("优惠券使用失败");
                }
            }
            //扣专业招生名额
            ChangeMajorNumberReq reduceMajorNumberReq = new ChangeMajorNumberReq();
            reduceMajorNumberReq.setMajorId(confirmEnrollReq.getId());
            reduceMajorNumberReq.setOrgMajorNumber(confirmEnrollReq.getEnrollNumber());
            reduceMajorNumberReq.setEnrollId(enrollId);
            System.out.println("reduceMajorNumberReq==" + reduceMajorNumberReq);
            final ChangeMajorNumberRes reduceMajorNumberRes = iMajorApi.reduceOrgMajorNumber(reduceMajorNumberReq);
            System.out.println("reduceMajorNumberRes==" + reduceMajorNumberRes.getRetCode());
            if (reduceMajorNumberReq == null || reduceMajorNumberRes.getRetCode().equals(TradeEnums.RetEnum.FAIL.getCode())) {
                throw new YchException("减专业招生名额失败..");
            }
            //更改订单状态
            Enroll tradeEnroll = new Enroll();
            tradeEnroll.setEnrollId(enrollId);
            tradeEnroll.setEnrollStatus(TradeEnums.EnrollStatusEnum.COMFIRM.getCode());
            //确认时间
            //tradeEnroll.setConfirmTime(new Date());
            final int i = enrollMapper.updateByPrimaryKeySelective(tradeEnroll);
            if (i <= 0) {
                throw new YchException("更改报名状态失败");
            }
            //  log.info("【更新报名状态成功！！！】");
        } catch (Exception e) {
            //4.远程调用失败，则发送MQ消息
            /**
             * 如何保证消息生产者一定将消息发送到mq?
             * 1.发送消息前保存发送事件到数据库ych_mq_producer_temp
             * 2.如果发送成功，就删除该事件ych_mq_producer_temp
             * 3.补充:定时任务-查询事件表，如果发现有记录，说明有消息没有发送成功，
             *   定时任务中发送该消息，成功后删除该事件
             *面试题：在你的项目中用过多线程吗？
             * 答：用过，对于执行耗时的任务(网络请求，磁盘的操作，非核心任务-发邮件，发短信，发消息)
             *
             *
             * 发送消息串行改为多线程异步
             *
             */
            try {
                sendEnrollCancelMessage(confirmEnrollReq, enrollId);
            } catch (YchException e1) {
                e1.printStackTrace();
            }
            //TODO 改进2
            throw new RuntimeException(e.getMessage());

        }
    }


    @Transactional //4个特性    4种隔离界别    7种传播特性
    public void sendEnrollCancelMessage(ConfirmEnrollReq confirmEnrollReq, final String enrollId) {
        //4.1创建消息体
        final CancelEnrollMQ cancelEnrollMQ = new CancelEnrollMQ();
        cancelEnrollMQ.setCouponId(confirmEnrollReq.getCouponId());
        cancelEnrollMQ.setOrgMajorId(confirmEnrollReq.getId());
        cancelEnrollMQ.setMajorNumber(confirmEnrollReq.getEnrollNumber());
        cancelEnrollMQ.setEnrollId(enrollId);
        cancelEnrollMQ.setUserId(confirmEnrollReq.getUserId());
        //一、保存事件
        final MqProducerTemp mqProducerTemp = new MqProducerTemp();
        mqProducerTemp.setCreateTime(new Date());
        mqProducerTemp.setGroupName(MQEnums.GroupName.ENROLL_MQ_GROUP.getDesc());
        mqProducerTemp.setMsgBody(JSONArray.toJSONString(cancelEnrollMQ));
        mqProducerTemp.setMsgTopic(MQEnums.TopicEnum.ENROLL_CANCEL.getTopic());
        mqProducerTemp.setMsgTag(MQEnums.TopicEnum.ENROLL_CANCEL.getTag());
        mqProducerTemp.setMsgKeys(enrollId);
        mqProducerTemp.setId(IDGenerator.generatorUUID());

        int result = mqProducerTempMapper.insert(mqProducerTemp);
        if (result <= 0) {
            throw new YchException("【保存发送取消报名事件失败....】");
        }
        log.info("【保存消息发送事件成....】");
        //二、发送消息
        //a.创建可缓存的线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                //发送
                final SendResult sendResult = tradeMQProducer.sendMessage(MQEnums.TopicEnum.ENROLL_CANCEL, enrollId, JSONArray.toJSONString(cancelEnrollMQ));
                log.info("【报名服务EnrollApiImpl创建订单失败后，发送MQ消息的结果为：{}】", sendResult);
                if (sendResult.getSendStatus().equals(SendStatus.SEND_OK)) {
                    //三、删除事件
                    mqProducerTempMapper.deleteByPrimaryKey(mqProducerTemp.getId());
                    log.info("【发送取消报名消息成功......】");
                }
            }
        });
    }

    /**
     * 创建不可以见订单
     *
     * @param confirmEnrollReq
     * @return
     * @throws Exception
     */

    private String saveNoConfirmOrder(ConfirmEnrollReq confirmEnrollReq) throws YchException {
        Enroll tradeEnroll = new Enroll();
        String enrollId = IDGenerator.generatorUUID();
        tradeEnroll.setEnrollId(enrollId);
        tradeEnroll.setUserId(confirmEnrollReq.getUserId());

        //订单状态
        tradeEnroll.setEnrollStatus(TradeEnums.EnrollStatusEnum.NO_COMFIRM.getCode());
        tradeEnroll.setPayStatus(TradeEnums.PayStatusEnum.NO_PAY.getCode());
        tradeEnroll.setAddress(confirmEnrollReq.getAddress());
        tradeEnroll.setConsignee(confirmEnrollReq.getConsignee());
        tradeEnroll.setOrgMajorId(confirmEnrollReq.getId());
        tradeEnroll.setOrgMajorNumber(confirmEnrollReq.getEnrollNumber());
        tradeEnroll.setOrgMajorTuition(confirmEnrollReq.getTuition());

        BigDecimal enrollAmount = confirmEnrollReq.getTuition().multiply(new BigDecimal(confirmEnrollReq.getEnrollNumber()));
        //订单总价，需要计算
        tradeEnroll.setEnrollAccount(enrollAmount);//总价
        //优惠券
        //1。如果优惠券不为空，表明选了优惠券
        final String couponId = confirmEnrollReq.getCouponId();
        if (StringUtils.isNotBlank(couponId)) {//判断字符串非空和非''
            QueryCouponReq queryCouponReq = new QueryCouponReq();
            queryCouponReq.setCouponId(confirmEnrollReq.getCouponId());
            System.out.println("queryCouponReq" + queryCouponReq);
            final QueryCouponRes queryCouponRes = iCouponApi.queryCoupon(queryCouponReq);
            System.out.println("queryCouponRes===" + queryCouponRes);
            if (queryCouponRes == null || queryCouponRes.getRetCode().equals(TradeEnums.RetEnum.FAIL.getCode())) {
                throw new YchException("优惠券非法");
            }
            if (!queryCouponRes.getIsUsed().equals(TradeEnums.YesNoEnum.NO.getCode())) {
                throw new YchException("优惠券已使用");
            }
            tradeEnroll.setCouponId(couponId);
            tradeEnroll.setCouponPaid(queryCouponRes.getCouponPrice());
        } else {
            tradeEnroll.setCouponPaid(BigDecimal.ZERO);
        }
        //助学金付款金额
        //实际付款金额=订单总金额-助学金-优惠券金额；
        BigDecimal payAmount = enrollAmount.subtract(confirmEnrollReq.getGrantAmount()).subtract(tradeEnroll.getCouponPaid());
        tradeEnroll.setPayAmount(payAmount);
        tradeEnroll.setCreateTime(new Date());
        final int ret = this.enrollMapper.insert(tradeEnroll);
        if (ret != 1) {
            throw new YchException("保存订单失败！");//用户不能看到,保存不可见订单失败
        }
        //  log.info("【保存未确认报名成功！！！】");
        return enrollId;
    }

    /**
     * 参数校验
     *
     * @param confirmEnrollReq
     * @param queryOrgMajorRes 【注意：】这里统一抛出 运行时异常，这样spring才能中断程序
     */

    private void checkConfirmOrderReq(ConfirmEnrollReq confirmEnrollReq, QueryOrgMajorRes queryOrgMajorRes) throws YchException {
        //1.下单信息不能为空
        if (confirmEnrollReq == null) {
            throw new YchException("下单信息不能为空");
        }
        //2.会员账号不能为空
        //3.商品编号不能为空
        //4.发货地址不能为空
        //5.购买商品数量不能小于0
        //6.查询商品为空或者远程调用失败(queryGoodsRes.getRetCode不为 TradeEnum.SUCCESS.getCode)  未查询到该商品
        //7.库存小于购买量    库存不足
        //8.商品价格不一致(传过来的价格与商品库价格不一致)
        //9.运费为空 设置为BigDecimal.Zero
        //10.商品总价为null 设置为BigDecimal.ZERO

    }
    //运费计算方式
//    private BigDecimal calculateShippingFee(BigDecimal enrollAmount){
//        if(enrollAmount.doubleValue()>100.00){
//            return BigDecimal.ZERO;
//        }else{
//            return new BigDecimal("10");
//        }
//
//    }
}
