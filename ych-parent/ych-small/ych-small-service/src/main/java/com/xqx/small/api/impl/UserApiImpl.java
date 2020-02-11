package com.xqx.small.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xqx.small.service.IUserService;
import com.xqx.ych.entity.User;
import com.xqx.ych.small.api.UserApi;

import javax.annotation.Resource;

@Service
public class UserApiImpl implements UserApi {
    @Resource
    private IUserService iUserService;

    @Override
    public int register(User user) {
        return iUserService.register(user);
    }
}
