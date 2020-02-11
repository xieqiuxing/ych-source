package com.xqx.ych.common.protocol.coupon;

import com.xqx.ych.common.protocol.BaseRes;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Description: 用一句话描述
 * @Auther: 新梦想*陈超
 * @Date: 2019-12-14 21:13
 */
@Data
public class QueryCouponRes extends BaseRes implements Serializable {
    private String isUsed;
    private BigDecimal couponPrice;


}
