package com.chen.vueblog.mapper;

import com.chen.vueblog.entity.Blog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.vueblog.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author 陈天祥
 * @since 2021-03-23
 */

public interface BlogMapper extends BaseMapper<Blog> {
    // 自定义sql语句查询
    @Select(" select *  from m_blog")
    public List<Blog> findAllBlogs();
}
