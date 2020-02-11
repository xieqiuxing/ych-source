package com.xqx.small.coupon.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xqx.ych.common.constans.ServerResponse;
import com.xqx.ych.common.protocol.coupon.ChangeCouponStatusReq;
import com.xqx.ych.common.protocol.coupon.ChangeCouponStatusRes;
import com.xqx.ych.common.protocol.coupon.QueryCouponReq;
import com.xqx.ych.common.protocol.coupon.QueryCouponRes;
import com.xqx.ych.small.api.ICouponApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coupon")
public class CouponController {
    @Reference
    private ICouponApi iCouponApi;

    @RequestMapping(value = "/changeCouponStatus", method = RequestMethod.POST)
    public ServerResponse changeCouponStatus(ChangeCouponStatusReq changeCouponStatusReq) {
        ChangeCouponStatusRes result = iCouponApi.changeCouponStatus(changeCouponStatusReq);
        if (result.getRetCode().equals("")) {
            return ServerResponse.createByErrorMessage("更改优惠券信息失败...");
        }
        return ServerResponse.createBySuccessMessage("更改优惠券信息成功...");
    }

    @RequestMapping(value = "/queryCoupon", method = RequestMethod.GET)
    public ServerResponse queryCoupon(@RequestParam(value = "couponId") String couponId) {
        QueryCouponReq queryCouponReq = new QueryCouponReq();
        queryCouponReq.setCouponId(couponId);
        QueryCouponRes queryCouponRes = iCouponApi.queryCoupon(queryCouponReq);
        if (queryCouponRes == null) {
            return ServerResponse.createByErrorMessage("查询优惠券信息失败...");
        }
        return ServerResponse.createBySuccess("查询优惠券信息成功...", queryCouponRes);
    }

    @RequestMapping(value = "/changeMajorQuot", method = RequestMethod.POST)
    public ServerResponse changeMajorQuot(@RequestParam(value = "majorId", required = false) Integer majorId,
                                          @RequestParam(value = "quot", required = false) Integer quot,
                                          @RequestParam(value = "enrollId", required = false) String enrollId,
                                          @RequestParam(value = "numberLogType", required = false) String numberLogType,
                                          @RequestParam(value = "orgId", required = false) Integer orgId) {
        int result = iCouponApi.changeMajorQuot(majorId, orgId, quot, enrollId, numberLogType);
        if (result == 0) {
            return ServerResponse.createByErrorMessage("更改优惠券信息失败...");
        }
        return ServerResponse.createBySuccessMessage("更改优惠券信息成功..");
    }
}
