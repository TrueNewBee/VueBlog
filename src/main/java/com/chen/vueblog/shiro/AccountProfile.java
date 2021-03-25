package com.chen.vueblog.shiro;

import lombok.Data;
import java.io.Serializable;

/**
 * @author Chen
 * @date 2021年03月24日 15:10
 * @details 序列化用户信息
 */
@Data
public class AccountProfile implements Serializable {
    private Long id;

    private String username;

    private String avatar;

    private String email;
}
