package com.xqx.ych.common.rocketmq;

import org.apache.rocketmq.common.message.MessageExt;

public interface IMessageProcessor {
    boolean handleMesage(MessageExt messageExt);
}
