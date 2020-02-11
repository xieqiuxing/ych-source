package com.xqx.ych.common.protocol.mq;

import lombok.Data;

@Data
public class CancelEnrollMQ {
    private String enrollId;
    private Integer userId;
    private Integer orgMajorId;
    private Integer majorNumber;
    private String couponId;


}
