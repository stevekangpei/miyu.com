package com.miyu.eurekaclient.userservice;

import com.miyu.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserService {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() throws  Exception {

        return "用户已验证";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public boolean login(@RequestParam("name") String name,
                        @RequestParam("pwd") String pwd) throws  Exception {


        return "admin".equals(name) && "123456".equals(pwd);
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public boolean login(@RequestBody User user) throws  Exception {


        return "admin".equals(user.getName()) && "123456".equals(user.getPassword());
    }

}
