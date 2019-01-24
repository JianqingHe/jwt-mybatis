package com.usoft.b2b.manage.open;

import com.usoft.b2b.manage.bean.ResultMap;
import com.usoft.b2b.manage.exception.MyException;
import com.usoft.b2b.manage.service.UserService;
import com.usoft.b2b.manage.utils.AgentUtils;
import com.usoft.b2b.manage.utils.JwtUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * 账户操作
 *
 * @author hejq
 * @date 2018-12-24 16:29
 */
@RestController
@RequestMapping("/public/account")
public class AccountController extends BaseController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResultMap login(@RequestParam("userName") String userName,
                           @RequestParam("password") String password) {
        if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)) {
            throw new MyException(HttpStatus.UNAUTHORIZED.toString(), "账号和密码不能为空");
        }
        return userService.login(userName, password, AgentUtils.getIpString(request));
    }

    /**
     * 刷新token
     *
     * @return 重新生成的token
     */
    @GetMapping("/refresh")
    @RequiresAuthentication
    public ResultMap refreshToken() {
        org.apache.shiro.subject.Subject subject = SecurityUtils.getSubject();
        if (subject.isAuthenticated()) {
            return userService.refreshToken(JwtUtil.getUserName(subject.getPrincipal().toString()));
        }
        return ResultMap.error(new MyException(HttpStatus.UNAUTHORIZED.toString(), "token已过期"));
    }
}
