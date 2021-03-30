package com.chen.vueblog.mapper;

import com.chen.vueblog.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 陈天祥
 * @since 2021-03-23
 * @Details 通过mybatis注解使用自定义sql语句
 */

public interface UserMapper extends BaseMapper<User> {

    // 自定义sql语句查询(查询数据库中其他表)
    @Select(" select *  from user")
    public List<User> findAllUser();
}
