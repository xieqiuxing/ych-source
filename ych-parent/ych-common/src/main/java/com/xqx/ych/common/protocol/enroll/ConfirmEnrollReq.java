package com.xqx.ych.common.protocol.enroll;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Description: 用一句话描述
 * @Auther: 新梦想*陈超
 * @Date: 2019-12-14 20:33
 */
@Data
public class ConfirmEnrollReq implements Serializable {
    private Integer userId;
    private Integer id;//orgMajorId
    private String consignee;/*通知书收件人*/
    private Integer enrollNumber;
    private BigDecimal tuition;//单价
    private BigDecimal enrollAmount;//总价
    private BigDecimal grantAmount;//助学金金额
    private String couponId;//优惠券id
    private String address;

}
