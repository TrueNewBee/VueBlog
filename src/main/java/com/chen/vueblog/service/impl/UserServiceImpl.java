package com.chen.vueblog.service.impl;

import com.chen.vueblog.entity.User;
import com.chen.vueblog.mapper.UserMapper;
import com.chen.vueblog.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 陈天祥
 * @since 2021-03-23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    // 调用自己的sql语句查询
    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }
}
