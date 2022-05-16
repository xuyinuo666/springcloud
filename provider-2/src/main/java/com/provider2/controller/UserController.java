package com.provider2.controller;

import com.provider2.service.IUserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.Res;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;
    @Value("${server.port}")
    private String port;

    @RequestMapping("/getByUserId")
    public Res getByUserId(Long userId) {
        System.out.println(port);
//        Thread.sleep(2000);
        return Res.success(userService.getByUserId(userId));
    }
}
