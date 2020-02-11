package com.xqx.small.pay.service.impl;

import com.xqx.small.pay.service.IPayService;
import com.xqx.ych.entity.Pay;
import com.xqx.ych.mapper.PayMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PayServiceImpl implements IPayService {
    @Resource
    private PayMapper payMapper;

    @Override
    public int creatPayment(Pay pay) {
        int result = payMapper.insert(pay);
        return result;
    }

    @Override
    public int callbackPayment(String payId, String isPaid) {
        int result = payMapper.updateIsPaid(payId, isPaid);
        return result;
    }
}
