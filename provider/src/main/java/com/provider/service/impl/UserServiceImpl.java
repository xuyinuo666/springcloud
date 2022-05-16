package com.provider.service.impl;

import com.provider.entity.User;
import com.provider.mapper.UserMapper;
import com.provider.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
        return this.lambdaQuery()
                .eq(User::getId,userId)
                .eq(User::getIsDel,0)
                .one();
    }
}
