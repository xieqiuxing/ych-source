package com.xqx.small.pay.service;

import com.xqx.ych.entity.Pay;

public interface IPayService {
    public int creatPayment(Pay pay);

    public int callbackPayment(String payId, String isPaid);
}
