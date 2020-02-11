package com.xqx.manage.service;

import com.xqx.ych.common.protocol.pageHelper.PageRes;
import com.xqx.ych.common.protocol.user.UserRes;
import com.xqx.ych.entity.User;

public interface IUserService {
    public User login(String userName, String userPassword);

    public int userRegister(User user);

    public PageRes<UserRes> listByPage(int pageNum, int pageSize, Integer userType);

    User findUserByPrincipal(String principal);
}
