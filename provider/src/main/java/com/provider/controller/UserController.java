package com.provider.controller;

import com.provider.entity.User;
import com.provider.service.IUserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public Res getByUserId(@RequestParam("userId") Long userId) {
        System.out.println(port);
        User byUserId = userService.getByUserId(userId);
        return Res.success(byUserId);
    }
}
