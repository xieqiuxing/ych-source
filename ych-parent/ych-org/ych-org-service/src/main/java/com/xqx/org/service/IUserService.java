package com.xqx.org.service;

import com.xqx.ych.common.protocol.user.UserInfo;

public interface IUserService {
    public UserInfo findByUserName(String userName);

}
