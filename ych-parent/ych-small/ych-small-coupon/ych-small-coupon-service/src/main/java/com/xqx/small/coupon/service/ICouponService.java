package com.xqx.small.coupon.service;

import com.xqx.ych.common.protocol.coupon.ChangeCouponStatusReq;
import com.xqx.ych.common.protocol.coupon.ChangeCouponStatusRes;
import com.xqx.ych.common.protocol.coupon.QueryCouponReq;
import com.xqx.ych.common.protocol.coupon.QueryCouponRes;

public interface ICouponService {
    public ChangeCouponStatusRes changeCouponStatus(ChangeCouponStatusReq changeCouponStatusReq);

    public QueryCouponRes queryCoupon(QueryCouponReq queryCouponReq);

    public int changeMajorQuot(Integer majorId, Integer orgId, Integer quot, String enrollId, String numberLogType);
}
