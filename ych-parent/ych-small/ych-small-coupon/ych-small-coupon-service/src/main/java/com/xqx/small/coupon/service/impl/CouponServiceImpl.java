package com.xqx.small.coupon.service.impl;

import com.xqx.small.coupon.service.ICouponService;
import com.xqx.ych.common.constans.TradeEnums;
import com.xqx.ych.common.exception.YchException;
import com.xqx.ych.common.protocol.coupon.ChangeCouponStatusReq;
import com.xqx.ych.common.protocol.coupon.ChangeCouponStatusRes;
import com.xqx.ych.common.protocol.coupon.QueryCouponReq;
import com.xqx.ych.common.protocol.coupon.QueryCouponRes;
import com.xqx.ych.entity.Coupon;
import com.xqx.ych.entity.CouponExample;
import com.xqx.ych.entity.MajorNumberLog;
import com.xqx.ych.mapper.CouponMapper;
import com.xqx.ych.mapper.MajorNumberLogMapper;
import com.xqx.ych.mapper.OrgMajorMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CouponServiceImpl implements ICouponService {
    @Resource
    private CouponMapper couponMapper;
    @Resource
    private MajorNumberLogMapper majorNumberLogMapper;
    @Resource
    private OrgMajorMapper orgMajorMapper;

    @Override
    public ChangeCouponStatusRes changeCouponStatus(ChangeCouponStatusReq changeCouponStatusReq) {
        ChangeCouponStatusRes changeCouponStatusRes = new ChangeCouponStatusRes();
        changeCouponStatusRes.setRetCode(TradeEnums.RetEnum.SUCCESS.getCode());
        changeCouponStatusRes.setRetInfo(TradeEnums.RetEnum.FAIL.getDesc());
        try {
            if (changeCouponStatusReq == null || StringUtils.isBlank(changeCouponStatusReq.getCouponId())) {
                throw new YchException("请求参数不正确，优惠券编号为空");
            }
            Coupon coupon = new Coupon();
            coupon.setCouponId(changeCouponStatusReq.getCouponId());
            coupon.setEnrollId(changeCouponStatusReq.getEnrollId());
            //如果传过来的参数为已使用，则将优惠卷改为已使用
            if (changeCouponStatusReq.getIsUsed().equals(TradeEnums.YesNoEnum.YES.getCode())) {
                int i = couponMapper.useCoupon(coupon);
                if (i <= 0) {
                    throw new Exception("更改优惠卷状态失败");
                }
            }
            if (changeCouponStatusReq.getIsUsed().equals(TradeEnums.YesNoEnum.NO.getCode())) {
                int i = couponMapper.unUseCoupon(coupon);
                if (i <= 0) {
                    throw new Exception("更改优惠卷状态失败");
                }
            }
        } catch (Exception e) {
            changeCouponStatusRes.setRetCode(TradeEnums.RetEnum.FAIL.getCode());
            changeCouponStatusRes.setRetInfo(TradeEnums.RetEnum.FAIL.getDesc());
        }
        return changeCouponStatusRes;
    }

    @Override
    public QueryCouponRes queryCoupon(QueryCouponReq queryCouponReq) {
        QueryCouponRes queryCouponRes = new QueryCouponRes();
        queryCouponRes.setRetCode(TradeEnums.RetEnum.SUCCESS.getCode());
        queryCouponRes.setRetInfo(TradeEnums.RetEnum.SUCCESS.getDesc());
        try {
            if (queryCouponReq == null || StringUtils.isBlank(queryCouponReq.getCouponId())) {
                throw new RuntimeException("请求参数不正确，优惠券编号不能为空");
            }
            CouponExample example = new CouponExample();
            example.createCriteria().andCouponIdEqualTo(queryCouponReq.getCouponId());
            Coupon coupon = couponMapper.selectByExample(example).get(0);
            if (coupon != null) {
                //这里最好使用 spring的beanUtils，不要用apache的，否则改变数据类型
                BeanUtils.copyProperties(coupon, queryCouponRes);
            } else {
                throw new RuntimeException("未查到优惠券....");
            }
        } catch (Exception e) {
            queryCouponRes.setRetCode(TradeEnums.RetEnum.FAIL.getCode());
            queryCouponRes.setRetInfo(TradeEnums.RetEnum.FAIL.getDesc());
        }
        return queryCouponRes;
    }


    @Override
    public int changeMajorQuot(Integer majorId, Integer orgId, Integer quot, String enrollId, String numberLogType) {
        MajorNumberLog majorNumberLog = new MajorNumberLog();
        majorNumberLog.setMajorId(majorId);
        majorNumberLog.setOrgId(orgId);
        majorNumberLog.setMajorNumber(quot);
        majorNumberLog.setEnrollId(enrollId);
        majorNumberLog.setNumberLogType(numberLogType);
        int result = majorNumberLogMapper.insertSelective(majorNumberLog);
        if (result <= 0) {
            return 0;
        }
        int result2 = -1;
        if (numberLogType.equals(1)) {
            result2 = orgMajorMapper.reduceQuot(majorId, quot);
        } else if (numberLogType.equals(2)) {
            result2 = orgMajorMapper.addQuot(majorId, quot);
        } else {
            return 0;
        }
        return result2;
    }


}
