package com.xqx.small.pay.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xqx.small.pay.service.IPayService;
import com.xqx.ych.entity.Pay;
import com.xqx.ych.small.api.IPayApi;

import javax.annotation.Resource;

@Service
public class PayApiImpl implements IPayApi {
    @Resource
    private IPayService iPayService;

    @Override
    public int creatPayment(Pay pay) {
        return iPayService.creatPayment(pay);
    }

    @Override
    public int callbackPayment(String payId, String isPaid) {
        return iPayService.callbackPayment(payId, isPaid);
    }
}
