package com.xqx.small.enroll.mq.processor;

import com.alibaba.fastjson.JSON;
import com.xqx.ych.common.constans.TradeEnums;
import com.xqx.ych.common.protocol.mq.CancelEnrollMQ;
import com.xqx.ych.common.rocketmq.IMessageProcessor;
import com.xqx.ych.entity.Enroll;
import com.xqx.ych.mapper.EnrollMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.common.message.MessageClientExt;
import org.apache.rocketmq.common.message.MessageExt;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 这个消费者：用于处理将报名状态改为 取消报名状态
 */
@Slf4j
public class CancelEnrollProcessor implements IMessageProcessor {


    //########################################################
    //
    //     严格来讲这里要用 TradeOrderSercvice 这里偷了懒
    //########################################################

    @Autowired
    private EnrollMapper enrollMapper;

    public boolean handleMesage(MessageExt messageExt) {
        try {
            //消息内容
            String body = new String(messageExt.getBody(), "utf-8");
            //消息id  TODO  rocketmq 3,5,8 需要msgid 查询消息，而3.5.8以后，需要offsetmsgid 所有这里保存offsetmsgId
            String msgId = messageExt.getMsgId();
            if (messageExt instanceof MessageClientExt) {
                msgId = ((MessageClientExt) messageExt).getOffsetMsgId();
            }
            //消息tag
            final String tags = messageExt.getTags();
            //业务主键----keys
            final String keys = messageExt.getKeys();

            final CancelEnrollMQ cancelOrderMQ = JSON.parseObject(body, CancelEnrollMQ.class);
            //日志打印，方便调试----打印消息内容打印id  keys body
            log.info("enroll CancelEnrollProcessor recive message:" + messageExt);
            Enroll tradeEnroll = new Enroll();
            tradeEnroll.setEnrollId(cancelOrderMQ.getEnrollId());
            tradeEnroll.setEnrollStatus(TradeEnums.EnrollStatusEnum.CANCEL.getCode());


            enrollMapper.updateByPrimaryKeySelective(tradeEnroll);

            return true;
        } catch (Exception e) {
//            e.printStackTrace();
            return false;
        }
    }
}
