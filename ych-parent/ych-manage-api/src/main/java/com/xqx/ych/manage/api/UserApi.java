package com.xqx.ych.manage.api;

import com.xqx.ych.common.protocol.pageHelper.PageRes;
import com.xqx.ych.common.protocol.user.UserRes;
import com.xqx.ych.entity.User;

public interface UserApi {
    //String getName();

    /**
     * 后台登录
     *
     * @param userName
     * @param userPassword
     * @return
     */
    User login(String userName, String userPassword);

    /**
     * 后台注册
     *
     * @param user
     * @return
     */
    public int userRegister(User user);

    /**
     * 运营管理后台用户管理个人用户
     *
     * @param pageNum
     * @param pageSize
     * @param userType
     * @return
     */
    public PageRes<UserRes> listByPage(int pageNum, int pageSize, Integer userType);

    /**
     * 通过用户名查询用户信息
     *
     * @param principal
     * @return
     */
    User findUserByPrincipal(String principal);
}
