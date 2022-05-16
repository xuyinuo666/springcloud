package com.provider2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.provider2.entity.User;
import com.provider2.mapper.UserMapper;
import com.provider2.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xugaowei
 * @since 2022-05-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public User getByUserId(Long userId) {
        return this.lambdaQuery().eq(User::getId,userId).one();
    }
}
