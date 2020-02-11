package com.xqx.manage.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xqx.ych.common.constans.ServerResponse;
import com.xqx.ych.common.exception.YchException;
import com.xqx.ych.common.protocol.login.LoginRes;
import com.xqx.ych.common.protocol.pageHelper.PageRes;
import com.xqx.ych.entity.User;
import com.xqx.ych.manage.api.UserApi;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Reference
    private UserApi userApi;
    private Integer pageNum = 1;
    private Integer pageSize = 10;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ServerResponse login(String userName, String userPassword) {
        System.out.println(userName + "============" + userPassword);
        //1、参数校验
        checkLoginInfo(userName, userPassword);
        //shiro的Subject对象进行登录认证
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken authenticationToken = new UsernamePasswordToken(userName, userPassword);
        System.out.println("authenticationToken====" + authenticationToken);
        subject.login(authenticationToken);

        User user = (User) subject.getSession().getAttribute("userLogin");
        LoginRes loginRes = new LoginRes();
        BeanUtils.copyProperties(user, loginRes);
        return ServerResponse.createBySuccess("登录成功", loginRes);
        //2、登录(调用UserApi根据用户和密码查询该用户是否存在在数据库中)
        //user=userApi.login(user.getUserName(),user.getUserPassword());
        //3、返回6
//        if (user==null){
//            return  ServerResponse.createByErrorMessage("用户名或者密码错误");
//        }
//        LoginRes loginRes=new LoginRes();
//        try {
//            BeanUtils.copyProperties(loginRes,user);
//        } catch (Exception e) {
//            throw new YchException("登录失败");
//        }
        //TODO登录成功后获取用户信息，之前反正sessin-shiro
        // return ServerResponse.createBySuccess("登录成功",loginRes);
    }

    @RequestMapping("/register")
    public ServerResponse register(User user) {
        int result = userApi.userRegister(user);
        if (result <= 0) {
            return ServerResponse.createByErrorMessage("注册失败");
        }
        return ServerResponse.createBySuccessMessage("注册成功");
    }

    @RequestMapping(value = "/listByPage/{userType}", method = RequestMethod.GET)
    public ServerResponse listByPage(@RequestParam(value = "pageNum", required = false) Integer pageNum,
                                     @RequestParam(value = "pageSize", required = false) Integer pageSize,
                                     @PathVariable Integer userType) {
        if (pageNum == null) {
            pageNum = 1;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        System.out.println("pageNum=" + pageNum + "pageSize=" + pageSize + "userType=" + userType);
        PageRes users = userApi.listByPage(pageNum, pageSize, userType);
        if (users == null) {
            return ServerResponse.createByErrorMessage("查询失败");
        }
        return ServerResponse.createBySuccess("查询成功", users);

    }

    private void checkLoginInfo(String userName, String userPassword) {
        if (StringUtils.isBlank(userName) || StringUtils.isBlank(userPassword)) {
            throw new YchException("用户名或者密码错误");
        }
    }

}

