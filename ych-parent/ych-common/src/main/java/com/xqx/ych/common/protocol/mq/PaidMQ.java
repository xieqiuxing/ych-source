package com.xqx.ych.common.protocol.mq;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PaidMQ {
    private String payId;
    private String EnrollId;
    private String EnrollStatus;
    private BigDecimal payAmount;/*可以省略该字段*/

}
