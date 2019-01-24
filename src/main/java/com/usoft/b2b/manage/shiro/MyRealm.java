package com.usoft.b2b.manage.shiro;

import com.usoft.b2b.manage.domain.UserBaseInfo;
import com.usoft.b2b.manage.domain.Users;
import com.usoft.b2b.manage.service.UserService;
import com.usoft.b2b.manage.support.SystemSession;
import com.usoft.b2b.manage.utils.JwtUtil;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 自定义过滤
 *
 * @author hejq
 * @date 2018-12-25 17:27
 */
@Service
public class MyRealm extends AuthorizingRealm {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    private static final String PACKAGE_PATH = "com.usoft.b2b.manage.";

    /**
     * 类名
     */
    private static final String CLASS_NAME = Thread.currentThread().getStackTrace()[1].getClassName().replace(PACKAGE_PATH, "");

    /**
     * 检测用户权限
     *
     * @param principals PrincipalCollection
     * @return AuthorizationInfo
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String userName = JwtUtil.getUserName(principals.toString());
        Users user = userService.findByUserName(userName);
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        Set<String> permission = new HashSet<>(Arrays.asList(user.getRoles().split(",")));
        authorizationInfo.setStringPermissions(permission);
        return authorizationInfo;
    }

    /**
     * 用户验证
     * @param auth AuthenticationToken
     * @return AuthenticationInfo
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken auth) throws AuthenticationException {
        String token = (String) auth.getCredentials();
        // 解密获得username，用于和数据库进行对比
        String userName = JwtUtil.getUserName(token);
        if (userName == null) {
            throw new AuthenticationException("token invalid");
        }

        Users user = userService.findByUserName(userName);
        if (!JwtUtil.verify(token, userName, user.getPassword())) {
            throw new AuthenticationException("UserName or password error");
        }

        SystemSession.setUser(new UserBaseInfo(user));
        return new SimpleAuthenticationInfo(token, token, CLASS_NAME);
    }

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JwtToken;
    }
}
