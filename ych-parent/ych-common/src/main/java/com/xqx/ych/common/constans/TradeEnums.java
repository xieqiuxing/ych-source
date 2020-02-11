package com.xqx.ych.common.constans;

/**
 * @Description: 用一句话描述
 * @Auther: 新梦想*陈超
 * @Date: 2019-12-14 21:00
 */
public class TradeEnums {
    /*报名状态*/
    public enum EnrollStatusEnum {
        NO_COMFIRM("0", "订单未确认"), COMFIRM("1", "确认订单"), CANCEL("2", "取消报名"), INVALID("3", "非法报名"), RETURNED("4", "退费");
        private String code;
        private String desc;

        EnrollStatusEnum(String code, String desc) {
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

    /*支付状态*/
    public enum PayStatusEnum {
        NO_PAY("0", "未付款"), PAYING("1", "付款中"), FIED("2", "付款失败");
        private String code;
        private String desc;

        PayStatusEnum(String code, String desc) {
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

    /*优惠券使用状态*/
    public enum YesNoEnum {
        YES("0", "已使用"), NO("1", "未使用");
        private String code;
        private String desc;

        YesNoEnum(String code, String desc) {
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

    /*改变名额数量类型：增加或者减少*/
    public enum MajorNumberTypeLogEnum {
        ENROLL("1", "报名"), RETURN("2", "退费");
        private String code;
        private String desc;

        MajorNumberTypeLogEnum(String code, String desc) {
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

    /*远程调用响应码与状态*/
    public enum RetEnum {
        SUCCESS("1", "请求成功"), FAIL("2", "请求失败");
        private String code;
        private String desc;

        RetEnum(String code, String desc) {
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
