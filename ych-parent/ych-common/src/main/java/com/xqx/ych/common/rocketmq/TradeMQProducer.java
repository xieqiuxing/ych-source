package com.xqx.ych.common.rocketmq;

import com.xqx.ych.common.constans.MQEnums;
import com.xqx.ych.common.exception.YchException;
import com.xqx.ych.common.rocketmq.exception.TradeMQException;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
public class TradeMQProducer {
    public static final Logger LOGGER = LoggerFactory.getLogger(TradeMQProducer.class);
    private DefaultMQProducer producer;
    private String groupName;
    private String nameSrvAddr;
    private int maxMessageSize = 1024 * 1024 * 4;
    private int sendMsgTimeout = 10 * 1000;

    public void init() throws TradeMQException {
        if (StringUtils.isBlank(this.groupName)) {
            throw new TradeMQException("groupName is blank! ");
        }
        this.producer = new DefaultMQProducer(groupName);
        this.producer.setNamesrvAddr(nameSrvAddr);
        this.producer.setMaxMessageSize(maxMessageSize);
        this.producer.setSendMsgTimeout(sendMsgTimeout);
        try {
            LOGGER.error(String.format("productor start! groupName:{%s},nameSrvAddr:{%s}", this.groupName, this.nameSrvAddr));
            producer.start();
        } catch (Exception e) {
            LOGGER.error(String.format("productor error! groupName:{%s},nameSrvAddr:{%s}", this.groupName, this.nameSrvAddr));
            throw new YchException(e.getMessage());
        }

    }

    public org.apache.rocketmq.client.producer.SendResult sendMessage(String topic, String tags, String keys, String messageBody) throws YchException {
        if (StringUtils.isBlank(topic)) {
            throw new YchException("Topic is blank");
        }
        if (StringUtils.isBlank(messageBody)) {
            throw new YchException("messageBody is blank");
        }
        Message message = new Message(topic, tags, keys, messageBody.getBytes());
        try {
            SendResult sendResult = this.producer.send(message);
            return sendResult;
        } catch (Exception e) {
            LOGGER.error("send mesage error:", e.getMessage(), e);
            throw new YchException(e.getMessage());
        }
    }

    //支持枚举的方式发送消息
    public SendResult sendMessage(MQEnums.TopicEnum topicEnum, String keys, String messageBody) throws YchException {
        return this.sendMessage(topicEnum.getTopic(), topicEnum.getTag(), keys, messageBody);
    }


}
