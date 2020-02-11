package com.xqx.small.coupon.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xqx.small.coupon.service.ICouponService;
import com.xqx.ych.common.protocol.coupon.ChangeCouponStatusReq;
import com.xqx.ych.common.protocol.coupon.ChangeCouponStatusRes;
import com.xqx.ych.common.protocol.coupon.QueryCouponReq;
import com.xqx.ych.common.protocol.coupon.QueryCouponRes;
import com.xqx.ych.small.api.ICouponApi;

import javax.annotation.Resource;

@Service
public class CouponApiImpl implements ICouponApi {
    @Resource
    private ICouponService iCouponService;

    @Override
    public QueryCouponRes queryCoupon(QueryCouponReq queryCouponReq) {
        return iCouponService.queryCoupon(queryCouponReq);
    }

    @Override
    public int changeMajorQuot(Integer majorId, Integer orgId, Integer quot, String enrollId, String numberLogType) {
        return iCouponService.changeMajorQuot(majorId, orgId, quot, enrollId, numberLogType);
    }

    @Override
    public ChangeCouponStatusRes changeCouponStatus(ChangeCouponStatusReq changeCouponStatusReq) {
        return iCouponService.changeCouponStatus(changeCouponStatusReq);
    }
}
