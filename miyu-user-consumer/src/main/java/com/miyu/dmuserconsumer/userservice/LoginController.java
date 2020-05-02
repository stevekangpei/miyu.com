package com.miyu.dmuserconsumer.userservice;

@RestController
public class LoginController {

    @Autowired
    private UserFeignClient userFeignClient;

    @RequestMapping("/userLogin")
    public String login() {

        return userFeignClient.login();
    }
}
