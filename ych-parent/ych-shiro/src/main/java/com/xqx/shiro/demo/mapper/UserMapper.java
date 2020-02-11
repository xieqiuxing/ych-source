package com.xqx.shiro.demo.mapper;

import com.xqx.shiro.demo.entity.User;

/**
 * @Description: 用一句话描述
 * @Auther: 新梦想*陈超
 * @Date: 2019-12-16 09:44
 */
public interface UserMapper {
    User findUserByUserName(String userName);
}
