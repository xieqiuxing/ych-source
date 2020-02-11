package com.xqx.ych.small.api;

import com.xqx.ych.entity.Pay;

public interface IPayApi {
    /**
     * 创建支付订单
     *
     * @param pay
     * @return
     */
    public int creatPayment(Pay pay);

    /**
     * 支付回调
     *
     * @param payId
     * @param isPaid
     * @return
     */
    public int callbackPayment(String payId, String isPaid);
}
