package com.xqx.small.enroll.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xqx.ych.common.constans.ServerResponse;
import com.xqx.ych.common.constans.TradeEnums;
import com.xqx.ych.common.protocol.enroll.ConfirmEnrollReq;
import com.xqx.ych.common.protocol.enroll.ConfirmEnrollRes;
import com.xqx.ych.entity.Enroll;
import com.xqx.ych.small.api.IEnrollApi;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enroll")
public class EnrollController {
    @Reference
    private IEnrollApi iEnrollApi;

    @RequestMapping(value = "/enroll", method = RequestMethod.POST)
    public ServerResponse addEnroll(Enroll enroll) {
        int result = iEnrollApi.addEnroll(enroll);
        if (result <= 0) {
            return ServerResponse.createBySuccessMessage("创建报名信息失败...");
        }
        return ServerResponse.createBySuccessMessage("创建报名信息成功...");
    }

    @RequestMapping(value = "/confirmEnroll", method = RequestMethod.POST)
    public ServerResponse confirmEnroll(@RequestBody ConfirmEnrollReq confirmEnrollReq) {
        System.out.println("confirmEnrollReq===" + confirmEnrollReq);
        ConfirmEnrollRes confirmEnrollRes = iEnrollApi.confirmEnrollStatus(confirmEnrollReq);
        if (confirmEnrollRes.getRetCode().equals(TradeEnums.RetEnum.FAIL.getCode())) {
            return ServerResponse.createByErrorMessage("创建报名失败..");
        }
        return ServerResponse.createBySuccess("创建报名成功", confirmEnrollRes);

    }
}
