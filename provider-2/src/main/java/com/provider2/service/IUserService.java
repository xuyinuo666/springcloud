package com.provider2.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.provider2.entity.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xugaowei
 * @since 2022-05-15
 */
public interface IUserService extends IService<User> {
    /**
     * 通过userId搜索
     * @param userId userId
     * @return
     */
    User getByUserId(Long userId);

}
