package com.xqx.ych.common.protocol.enroll;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class UserEnroll implements Serializable {
    private Integer orgMajorId;
    private Integer userId;
    private String schoolName;
    private String majorName;
    private String userName;
    private BigDecimal tuition;
    //预缴学费
    private BigDecimal preTuition;
    //助学金
    private BigDecimal grant;
    //预缴学费-助学金
    private BigDecimal actPreTuition;
    //优惠卷数量
    private Integer couponCount;
}
