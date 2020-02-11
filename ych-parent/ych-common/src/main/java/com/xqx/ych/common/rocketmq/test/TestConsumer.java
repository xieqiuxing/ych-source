package com.xqx.ych.common.rocketmq.test;

import com.xqx.ych.common.rocketmq.IMessageProcessor;
import org.apache.rocketmq.common.message.MessageExt;

public class TestConsumer implements IMessageProcessor {
    public boolean handleMesage(MessageExt messageExt) {
        System.out.println("messageExt===" + messageExt.getBody());
        return false;
    }
}
