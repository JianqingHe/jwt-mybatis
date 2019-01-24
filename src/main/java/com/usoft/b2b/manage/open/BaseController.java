package com.usoft.b2b.manage.open;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * controller 基础类
 * @author hejq
 * @date 2018-12-27 17:40
 */
public class BaseController {

    @Autowired
    protected HttpServletResponse response;

    @Autowired
    protected HttpServletRequest request;
}
