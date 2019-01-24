package com.usoft.b2b.manage.controller;

import com.usoft.b2b.manage.bean.ResultCode;
import com.usoft.b2b.manage.bean.ResultMap;
import com.usoft.b2b.manage.bean.ResultPage;
import com.usoft.b2b.manage.domain.SecUsers;
import com.usoft.b2b.manage.domain.Users;
import com.usoft.b2b.manage.service.UserService;
import com.usoft.b2b.manage.support.SystemSession;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * 用户查找
 *
 * @author hejq
 * @date 2018-12-17 11:30
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findOne")
    public SecUsers findById(Long uu) {
        return userService.selectByPrimaryKey(uu);
    }

    @GetMapping("/selectByPage")
    public ResultPage<Users> selectByPage(@RequestParam("pageNumber") long pageNumber,
                                          @RequestParam("pageSize") long pageSize,
                                          String keyword) {
        return userService.selectByPage(pageNumber, pageSize, keyword);
    }

    @GetMapping("/account")
    @RequiresAuthentication
    public ResultMap testLogin() {
        Subject subject = SecurityUtils.getSubject();
        if (subject.isAuthenticated()) {
            return ResultMap.success(SystemSession.getUser());
        }
        return ResultMap.error(new IllegalAccessException("Login failed"));
    }
}
