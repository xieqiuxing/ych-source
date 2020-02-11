package com.xqx.pay.coupon.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xqx.ych.common.constans.ServerResponse;
import com.xqx.ych.entity.Pay;
import com.xqx.ych.small.api.IPayApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/pay")
public class PayController {
    @Reference
    private IPayApi iPayApi;

    @RequestMapping(value = "/createPayment", method = RequestMethod.POST)
    public ServerResponse createPayment(@RequestParam(value = "payId", required = false) String payId,
                                        @RequestParam(value = "enrollId", required = false) String enrollId,
                                        @RequestParam(value = "payAmount", required = false) BigDecimal payAmount,
                                        @RequestParam(value = "isPaid", required = false) String isPaid) {
        Pay pay = new Pay();
        pay.setPayId(payId);
        pay.setEnrollId(enrollId);
        pay.setPayAmount(payAmount);
        pay.setIsPaid(isPaid);
        int result = iPayApi.creatPayment(pay);
        if (result <= 0) {
            return ServerResponse.createByErrorMessage("创建支付信息失败...");
        }
        return ServerResponse.createBySuccessMessage("创建支付信息成功..");
    }

    @RequestMapping(value = "/callbackPayment", method = RequestMethod.POST)
    public ServerResponse callbackPayment(@RequestParam(value = "payId", required = false) String payId,
                                          @RequestParam(value = "isPaid", required = false) String isPaid) {
        int result = iPayApi.callbackPayment(payId, isPaid);
        if (result <= 0) {
            return ServerResponse.createByErrorMessage("支付失败");
        }
        return ServerResponse.createBySuccessMessage("支付成功");
    }

}
