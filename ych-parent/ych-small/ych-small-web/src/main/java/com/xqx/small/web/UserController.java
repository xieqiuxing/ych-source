package com.xqx.small.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xqx.small.utils.PasswordHelper;
import com.xqx.ych.common.constans.ServerResponse;
import com.xqx.ych.entity.User;
import com.xqx.ych.small.api.UserApi;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Reference
    private UserApi userApi;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ServerResponse register(@RequestBody User user) {
        System.out.println("user1===" + user);
        user.setUserType(1);
        System.out.println("user2===" + user);
        user = new PasswordHelper().encrypt(user);
        System.out.println("user3===" + user);
        int result = userApi.register(user);
        if (result <= 0) {
            return ServerResponse.createByErrorMessage("添加失败");
        }
        return ServerResponse.createBySuccessMessage("添加成功");
    }
}
