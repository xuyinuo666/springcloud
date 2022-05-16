package com.provider2.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.provider2.entity.User;
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
