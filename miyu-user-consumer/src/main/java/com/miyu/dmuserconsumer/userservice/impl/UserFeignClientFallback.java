package com.miyu.dmuserconsumer.userservice.impl;

import com.miyu.dmuserconsumer.userservice.UserFeignClient;
import com.miyu.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserFeignClientFallback implements UserFeignClient {


    @Override
    public String login() {
        return "异常";
    }

    @Override
    public boolean login(String name, String pwd) {
        return false;
    }

    @Override
    public boolean login(User user) {
        return false;
    }
}
