package com.xqx.ych.common.constans;

public class MQEnums {
    public enum TopicEnum {
        ENROLL_CONFIRM("enrollTopic", "confirm"), ENROLL_CANCEL("enrollTopic", "cancel"), PAY_PAID("payTopic", "paid ");
        private String topic;
        private String tag;

        TopicEnum(String topic, String tag) {
            this.topic = topic;
            this.tag = tag;
        }

        public String getTopic() {
            return topic;
        }

        public void setTopic(String topic) {
            this.topic = topic;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }
    }

    public enum ConsumerStatus {
        PROCESSING("0", "正在处理"), SUCCESS("1", "处理成功"), FAIL("2", "处理失败");
        private String statusCode;
        private String statusDesc;

        ConsumerStatus(String statusCode, String statusDesc) {
            this.statusCode = statusCode;
            this.statusDesc = statusDesc;
        }

        public String getStatusCode() {
            return statusCode;
        }

        public void setStatusCode(String statusCode) {
            this.statusCode = statusCode;
        }

        public String getStatusDesc() {
            return statusDesc;
        }

        public void setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
        }
    }

    public enum GroupName {
        ENROLL_MQ_GROUP("10", "enrollProducerGroup");
        private String code;
        private String desc;

        GroupName(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }
}
