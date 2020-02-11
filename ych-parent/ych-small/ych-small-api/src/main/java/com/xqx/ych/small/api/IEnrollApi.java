package com.xqx.ych.small.api;

import com.xqx.ych.common.protocol.enroll.ConfirmEnrollReq;
import com.xqx.ych.common.protocol.enroll.ConfirmEnrollRes;
import com.xqx.ych.entity.Enroll;

public interface IEnrollApi {
    /**
     * 创建报名信息
     *
     * @param enroll
     * @return result
     */
    public int addEnroll(Enroll enroll);

    ConfirmEnrollRes confirmEnrollStatus(ConfirmEnrollReq confirmEnrollReq);
}
