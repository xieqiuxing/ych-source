package com.xqx.ych.common.rocketmq.listener;

import com.xqx.ych.common.rocketmq.IMessageProcessor;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;

public class TradeMQMesageLister implements MessageListenerConcurrently {
    private IMessageProcessor iMessageProcessor;

    public TradeMQMesageLister(IMessageProcessor iMessageProcessor) {
        this.iMessageProcessor = iMessageProcessor;
    }

    public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext context) {
        for (MessageExt msg : msgs) {
            boolean result = iMessageProcessor.handleMesage(msg);
            if (!result) {
                return ConsumeConcurrentlyStatus.RECONSUME_LATER;
            }
        }
        //消费状态：1.消费成功 2.消费失败
        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
    }
}
