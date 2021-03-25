package com.chen.vueblog.service.impl;

import com.chen.vueblog.entity.Blog;
import com.chen.vueblog.mapper.BlogMapper;
import com.chen.vueblog.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 陈天祥
 * @since 2021-03-23
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
