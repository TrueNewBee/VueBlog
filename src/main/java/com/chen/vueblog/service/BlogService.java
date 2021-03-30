package com.chen.vueblog.service;

import com.chen.vueblog.entity.Blog;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 陈天祥
 * @since 2021-03-23
 */
public interface BlogService extends IService<Blog> {
    public List<Blog> findAllBlogs();
    public List<Blog> findDescription();
}
