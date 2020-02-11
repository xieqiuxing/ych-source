package com.xqx.manage.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xqx.manage.service.IUserService;
import com.xqx.ych.common.protocol.pageHelper.PageRes;
import com.xqx.ych.common.protocol.user.UserRes;
import com.xqx.ych.entity.User;
import com.xqx.ych.manage.api.UserApi;

import javax.annotation.Resource;

@Service
public class UserManageApiImpl implements UserApi {
    @Resource
    private IUserService iUserService;

    // private static Logger logger= (Logger) LoggerFactory.getLogger(UserManageApiImpl.class);
    @Override
    public User login(String userName, String userPassword) {
        // logger.info("api"+userName);
        return iUserService.login(userName, userPassword);
    }

    @Override
    public int userRegister(User user) {
        return iUserService.userRegister(user);
    }

    @Override
    public PageRes<UserRes> listByPage(int pageNum, int pageSize, Integer userType) {
        return iUserService.listByPage(pageNum, pageSize, userType);
    }

    @Override
    public User findUserByPrincipal(String principal) {
        return iUserService.findUserByPrincipal(principal);
    }
}
