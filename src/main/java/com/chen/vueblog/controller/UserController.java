package com.chen.vueblog.controller;


import com.chen.vueblog.common.lang.Result;
import com.chen.vueblog.entity.User;
import com.chen.vueblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 陈天祥
 * @since 2021-03-23
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/index")
    public User index(){
        return userService.getById(1L);
    }

    @PostMapping("/save")
    public Result save(@Validated @RequestBody User user) {
        return Result.succ(user);
    }

    // 自定义sql语句查询其他表数据
    @GetMapping("/all")
    public List<User> findAllUser(){
        return userService.findAllUser();
    }
}
