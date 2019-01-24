package com.usoft.b2b.manage.exception;

/**
 * 验证异常信息
 *
 * @author hejq
 * @date 2018-12-24 16:43
 */
public class UnAuthorizedException extends RuntimeException {

    public UnAuthorizedException(String msg) {
        super(msg);
    }

    public UnAuthorizedException() {
        super();
    }
}
