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
 * @since 2021-03-30
 * @Details  你终于会用了如何自定义sql语句了!
 * 1. 在mapper中写上方法和SQL语句注解
 * 2. 在相关Service接口中添加该方法,并在实现类中实现
 * 3. 在Controller中调用Service中的方法即可!
 * 简简单单!
 */

public interface BlogMapper extends BaseMapper<Blog> {
    // 自定义sql语句查询
    @Select(" select *  from m_blog")
    public List<Blog> findAllBlogs();

    // 一些SQL语句的测试
    // 多表查询(查询title,description)
    @Select("SELECT title,description FROM m_blog b LEFT JOIN m_user u ON b.`user_id`=u.`id`")
    public List<Blog> findDescription();
}
