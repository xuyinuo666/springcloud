package com.consumer.openfeign;

import com.consumer.his.HystrixService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pojo.Res;

@Component
@FeignClient(value = "PROVIDER1", fallback = HystrixService.class)
public interface UserService {
    @RequestMapping("/user/getByUserId")
    Res getByUserId(@RequestParam("userId") Long userId);

}
