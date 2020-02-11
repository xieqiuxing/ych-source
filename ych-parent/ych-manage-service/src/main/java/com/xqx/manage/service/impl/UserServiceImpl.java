package com.xqx.manage.service.impl;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xqx.manage.service.IUserService;
import com.xqx.ych.common.protocol.pageHelper.PageRes;
import com.xqx.ych.common.protocol.user.UserRes;
import com.xqx.ych.entity.User;
import com.xqx.ych.entity.UserExample;
import com.xqx.ych.mapper.UserMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userMapper;
    private static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public User login(String userName, String userPassword) {
        log.info("登录中。。。。。。" + userName);
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(userName).andUserPasswordEqualTo(userPassword);
        List<User> users = userMapper.selectByExample(example);
        //  log.info("[登录成功，返回的数据为：]{}"+users.get(0));
        return users.get(0);
    }

    @Override
    public int userRegister(User user) {
        int result = userMapper.insert(user);
        return result;
    }

    @Override
    public PageRes<UserRes> listByPage(int pageNum, int pageSize, Integer userType) {
        PageHelper.startPage(pageNum, pageSize);
        UserExample example = new UserExample();
        example.createCriteria().andUserTypeEqualTo(userType);
        List<User> users = userMapper.selectByExample(example);
        Page pageUser = (Page) users;
        PageRes<UserRes> pageInfo = new PageRes<UserRes>();
        BeanUtils.copyProperties(pageUser, pageInfo);
        List<UserRes> userList = new ArrayList<UserRes>();
        for (User user : users) {
            UserRes userRes = new UserRes();
            BeanUtils.copyProperties(user, userRes);
            userList.add(userRes);
        }
        pageInfo.setTotal((int) ((Page<User>) users).getTotal());
        pageInfo.setList(userList);
        return pageInfo;
    }

    @Override
    public User findUserByPrincipal(String principal) {
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(principal);
        List<User> users = userMapper.selectByExample(example);
        if (users == null || users.size() <= 0) {
            return null;
        }
        System.out.println("users===" + users);
        User user = users.get(0);
        System.out.println("user====" + user);
        return user;
    }
}
