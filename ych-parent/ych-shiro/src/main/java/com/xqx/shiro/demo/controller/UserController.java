package com.xqx.shiro.demo.controller;

import com.xqx.shiro.demo.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: 用一句话描述
 * @Auther: 新梦想*陈超
 * @Date: 2019-12-16 10:35
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }

    @ResponseBody
    @RequestMapping("/login")
    public String login(User user) {
        //shiro的Subject对象进行登录认证
        Subject subject = SecurityUtils.getSubject();
        System.out.println("username" + user.getUserName() + "password==" + user.getPassword());
        UsernamePasswordToken authenticationToken = new UsernamePasswordToken(user.getUserName(), user.getPassword());
        subject.login(authenticationToken);
        return "success";
    }

    @RequestMapping("/admin/index")
    @ResponseBody
    public String toAdmin() {
        return "daaaa";
    }

}
