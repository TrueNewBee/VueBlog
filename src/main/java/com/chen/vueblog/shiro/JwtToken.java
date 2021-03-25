package com.chen.vueblog.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author Chen
 * @date 2021年03月24日 15:10
 * @details  接受jwt的token用于验证
 */

public class JwtToken implements AuthenticationToken {

    private String token;

    public JwtToken(String jwt) {
        this.token = jwt;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
