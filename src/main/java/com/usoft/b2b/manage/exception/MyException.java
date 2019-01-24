package com.usoft.b2b.manage.exception;

/**
 * 自定义异常
 *
 * @author hejq
 * @date 2018-07-12 20:07
 */
public class MyException extends RuntimeException {

    /**
     * default serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
     * 服务器错误
     */
    static final String SERVER_CODE = "500";

    /**
     * 默认异常信息
     */
    static final String ERROR_MSG = "程序异常";

    /**
     * 错误编码
     */
     private String errCode = SERVER_CODE;

    /**
     * 异常信息
     */
    private String errMsg = ERROR_MSG;

    /**
     * 自定义异常信息
     *
     * @param message 异常描述
     */
    public MyException(String message) {
        super(message);
        this.errMsg = message;
    }

    /**
     * 自定义异常信息
     *
     * @param errCode 编号
     * @param message 描述
     */
    public MyException(String errCode, String message) {
        super(message);
        this.errCode = errCode;
        this.errMsg = message;
    }
}
