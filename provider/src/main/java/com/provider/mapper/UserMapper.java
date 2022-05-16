package com.provider.mapper;

import com.provider.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xugaowei
 * @since 2022-05-15
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
