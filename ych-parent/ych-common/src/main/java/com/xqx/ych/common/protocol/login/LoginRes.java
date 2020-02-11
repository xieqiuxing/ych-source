package com.xqx.ych.common.protocol.login;

import lombok.Data;

import java.util.Date;

@Data
public class LoginRes {
    private Integer userId;
    private String userName;
    private String userMobile;
    private Integer userType;
    private String headImage;
    private Date userRegTime;
}
