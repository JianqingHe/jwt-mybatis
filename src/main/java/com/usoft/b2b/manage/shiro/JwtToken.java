package com.usoft.b2b.manage.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * JwtToken
 * 
 * @author hejq
 * @date 2018-12-24 17:12
 */
public class JwtToken implements AuthenticationToken {

    /**
     * 密钥
     */
    private String token;

    public JwtToken(String token) {
        this.token = token;
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
