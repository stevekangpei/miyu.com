package com.miyu.dmuserconsumer.userservice;

import com.miyu.dmuserconsumer.userservice.impl.UserFeignClientFallback;
import com.miyu.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "dm-user-provider", fallback = UserFeignClientFallback.class)
public interface UserFeignClient {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login();

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public boolean login(@RequestParam("name") String name,
                         @RequestParam("pwd") String pwd);


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public boolean login(@RequestBody User user);
}
