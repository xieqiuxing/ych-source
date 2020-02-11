package com.xqx.small.coupon.mq.processor;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.fastjson.JSON;
import com.xqx.small.coupon.service.ICouponService;
import com.xqx.ych.common.constans.TradeEnums;
import com.xqx.ych.common.exception.YchException;
import com.xqx.ych.common.protocol.coupon.ChangeCouponStatusReq;
import com.xqx.ych.common.protocol.coupon.ChangeCouponStatusRes;
import com.xqx.ych.common.protocol.mq.CancelEnrollMQ;
import com.xqx.ych.common.rocketmq.IMessageProcessor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.rocketmq.common.message.MessageExt;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class CancelCouponProcessor implements IMessageProcessor {

    //收到消息打出日志
    public static final Logger LOGGER = LoggerFactory.getLogger(CancelCouponProcessor.class);


    //########################################################
    //
    //     严格来讲这里要用 TradeOrderSercvice 这里偷了懒
    //########################################################

    public CancelCouponProcessor() {
        System.out.println("方法加载了");
    }

    @Autowired
    private ICouponService couponService;


    public boolean handleMesage(MessageExt messageExt) {
        System.out.println("handleMessage");
        try {
            //消息内容
            String body = new String(messageExt.getBody(), "utf-8");
            //消息id
            String msgId = messageExt.getMsgId();
            //消息tag
            final String tags = messageExt.getTags();
            //业务主键----keys
            final String keys = messageExt.getKeys();

            final CancelEnrollMQ cancelOrderMQ = JSON.parseObject(body, CancelEnrollMQ.class);
            //日志打印，方便调试----打印消息内容打印id  keys body
            LOGGER.info("order CancelCouponProcessor recive message:" + messageExt);
            if (StringUtils.isNotBlank(cancelOrderMQ.getCouponId())) {
                ChangeCouponStatusReq changeUserMoneyReq = new ChangeCouponStatusReq();
                changeUserMoneyReq.setCouponId(cancelOrderMQ.getCouponId());
                changeUserMoneyReq.setEnrollId(cancelOrderMQ.getEnrollId());
                //如果带了orderid 我们就将使用状态设置为 未使用
                changeUserMoneyReq.setIsUsed(TradeEnums.YesNoEnum.NO.getCode());
                ChangeCouponStatusRes changeCouponStatusRes = this.couponService.changeCouponStatus(changeUserMoneyReq);
                if (changeCouponStatusRes.getRetCode().equals(TradeEnums.RetEnum.FAIL.getCode())) {
                    throw new YchException("回退优惠卷信息失败");
                }
            }
            return true;
        } catch (Exception e) {
//          e.printStackTrace();
            return false;
        }
    }
}
