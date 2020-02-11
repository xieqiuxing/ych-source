package com.xqx.org.service.impl;

import com.xqx.org.service.IUserService;
import com.xqx.ych.common.protocol.user.UserInfo;
import com.xqx.ych.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public UserInfo findByUserName(String userName) {
        return null;
    }
//    @Override
//    public UserInfo findByUserName(String userName) {
//        User user=userMapper.findByUserName(userName);
//        UserInfo userInfo=new UserInfo();
//        BeanUtils.copyProperties(user,userInfo);
//        return userInfo;
//    }
}
