package com.xqx.ych.common.protocol.coupon;

import lombok.Data;

import java.io.Serializable;

@Data
public class ChangeCouponStatusReq implements Serializable {
    private String couponId;
    private String userId;
    private String isUsed;
    private String enrollId;
}

