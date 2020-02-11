package com.xqx.org.api;

import com.xqx.ych.common.protocol.user.UserInfo;

public interface IUserApi {
    /**
     * 获取机构用户已开通功能接口
     *
     * @param userName
     * @return
     */
    public UserInfo findByUserName(String userName);
}
