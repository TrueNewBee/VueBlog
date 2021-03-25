package com.chen.vueblog.util;

import com.chen.vueblog.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @author Chen
 * @date 2021年03月24日 16:38
 * @details
 */
public class ShiroUtil {
    // 实现文章强转
    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }

}
