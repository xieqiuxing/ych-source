package com.xqx.small.service.impl;

import com.xqx.small.service.IUserService;
import com.xqx.ych.entity.User;
import com.xqx.ych.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public int register(User user) {
        int i = userMapper.insertSelective(user);
        return i;
    }
}
