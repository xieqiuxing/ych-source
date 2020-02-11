package com.xqx.ych.common.rocketmq;

import com.xqx.ych.common.rocketmq.exception.TradeMQException;
import com.xqx.ych.common.rocketmq.listener.TradeMQMesageLister;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;

@Data
@Slf4j
public class TradeMQPushCumsumer {
    private DefaultMQPushConsumer consumer;
    private String groupName;
    private String nameSrvAddr;
    private String topic;
    private String tag = "*";//多个tage 以 ||分割
    private IMessageProcessor iMessageProcessor;


    /**
     * Minimum consumer thread number
     */
    private int consumeThreadMin = 20;

    /**
     * Max consumer thread number
     */
    private int consumeThreadMax = 20;

    public void init() throws TradeMQException {
        if (StringUtils.isBlank(this.groupName)) {
            throw new TradeMQException("groupName is blank! ");
        }
        consumer = new DefaultMQPushConsumer(groupName);
        try {
            consumer.subscribe(this.topic, this.tag);
            consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
            //wrong time format 2017_0422_221800
            consumer.setConsumeTimestamp("20181109221800");
            consumer.setConsumeThreadMin(consumeThreadMin);
            consumer.setConsumeThreadMax(consumeThreadMax);

            consumer.registerMessageListener(new TradeMQMesageLister(this.iMessageProcessor));
            consumer.start();
            log.info(String.format("consumer start! groupName:{%s},nameSrvAddr:{%s}", this.groupName, this.nameSrvAddr));
        } catch (MQClientException e) {
            log.error(String.format("consumer error! groupName:{%s},nameSrvAddr:{%s}", this.groupName, this.nameSrvAddr));
            throw new TradeMQException(e);
        }
    }

}
