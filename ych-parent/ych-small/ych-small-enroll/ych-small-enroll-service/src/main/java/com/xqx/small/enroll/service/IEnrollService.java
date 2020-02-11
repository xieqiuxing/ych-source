package com.xqx.small.enroll.service;

import com.xqx.ych.common.protocol.enroll.ConfirmEnrollReq;
import com.xqx.ych.common.protocol.enroll.ConfirmEnrollRes;
import com.xqx.ych.entity.Enroll;

public interface IEnrollService {
    public int addEnroll(Enroll enroll);

    ConfirmEnrollRes confirmEnrollStatus(ConfirmEnrollReq confirmEnrollReq);
}
