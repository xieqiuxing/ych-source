package com.xqx.service.impl;

import com.xqx.service.TestService;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class TestServiceImpl implements TestService {
    public String getName() {
        return "kate";
    }


    public String getAge() {
        return "30而立！！";
    }
}
