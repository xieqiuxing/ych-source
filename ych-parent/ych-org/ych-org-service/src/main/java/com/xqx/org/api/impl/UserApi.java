package com.xqx.org.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xqx.org.api.IUserApi;
import com.xqx.org.service.IUserService;
import com.xqx.ych.common.protocol.user.UserInfo;

import javax.annotation.Resource;

@Service
public class UserApi implements IUserApi {
    @Resource
    private IUserService iUserService;

    @Override
    public UserInfo findByUserName(String userName) {
        return iUserService.findByUserName(userName);
    }
}
