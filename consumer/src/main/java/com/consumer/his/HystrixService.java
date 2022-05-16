package com.consumer.his;

import com.consumer.openfeign.UserService;
import org.springframework.stereotype.Component;
import pojo.Res;

@Component
public class HystrixService implements UserService {
    @Override
    public Res getByUserId(Long userId) {
        return Res.error(userId + ": 用户获取失败～");
    }
}
