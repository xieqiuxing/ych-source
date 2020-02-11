package com.xqx.ych.small.api;

import com.xqx.ych.common.protocol.coupon.ChangeCouponStatusReq;
import com.xqx.ych.common.protocol.coupon.ChangeCouponStatusRes;
import com.xqx.ych.common.protocol.coupon.QueryCouponReq;
import com.xqx.ych.common.protocol.coupon.QueryCouponRes;

public interface ICouponApi {


    /**
     * 通过主键查询优惠卷信息
     *
     * @param queryCouponReq
     * @return
     */
    public QueryCouponRes queryCoupon(QueryCouponReq queryCouponReq);

    /**
     * 更新专业名额接口
     *
     * @param majorId
     * @param orgId
     * @param quot
     * @param enrollId
     * @param numberLogType
     * @return
     */
    public int changeMajorQuot(Integer majorId, Integer orgId, Integer quot, String enrollId, String numberLogType);

    /**
     * 修改优惠卷的信息
     *
     * @param changeCouponStatusReq
     * @return
     */
    ChangeCouponStatusRes changeCouponStatus(ChangeCouponStatusReq changeCouponStatusReq);

}
