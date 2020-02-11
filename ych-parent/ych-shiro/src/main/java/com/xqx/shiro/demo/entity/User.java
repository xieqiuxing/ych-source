package com.xqx.shiro.demo.entity;

import lombok.Data;

/**
 * @Description: 用一句话描述
 * @Auther: 新梦想*陈超
 * @Date: 2019-12-16 09:27
 */
@Data
public class User {
    private int id;
    private String userName;
    private String password;
    private String passwordSalt;//盐


}
