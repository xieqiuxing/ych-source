package com.xqx.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xqx.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: 用一句话描述
 * @Auther: 新梦想*陈超
 * @Date: 2019-12-03 10:36
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Reference//alibba
    private TestService testService;

    @ResponseBody
    @RequestMapping("/test01")
    public String test01() {
        //testService.getAge();
        return testService.getName();
    }
}
