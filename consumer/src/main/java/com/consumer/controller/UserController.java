package com.consumer.controller;

import com.consumer.openfeign.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.Res;

import javax.annotation.Resource;

@RestController
@RequestMapping("/consumer/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/getByUserId")
    public Res getByUserId(Long userId){
        return userService.getByUserId(userId);
    }
}
