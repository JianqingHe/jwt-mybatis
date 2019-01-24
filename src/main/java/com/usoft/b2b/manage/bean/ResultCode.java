package com.usoft.b2b.manage.bean;

/**
 * 返回结果状态码
 *
 * @author hejq
 * @date 2018-10-22 9:18
 */
public enum ResultCode {

    /**
     * 操作失败
     */
    ERROR(0, "ERROR"),

    /**
     * 操作成功
     */
    OK(1, "SUCCESS"),

    /**
     * 参数信息缺失
     */
    NO_INFO(2, "NO_INFO"),

    /**
     * 操作实体信息不全
     */
    NOT_COMPLETE_INFO(3, "NOT_COMPLETE_INFO"),

    /**
     * 操作实体已存在
     */
    SAVED(4, "SAVED"),

    /**
     * 非法状态
     */
    ERROR_STATE(5, "ERROR_STATE"),

    /**
     * 操作不允许
     */
    NOT_PERMIT(6, "NOT_PERMIT"),

    /**
     * 操作实体不存在
     */
    NOT_EXiST(7, "NOT_EXiST"),

    /**
     * 参数异常，不在取值范围之内等原因
     */
    PARAMETER_ERROR(8, "PARAMETER_ERROR"),

    /**
     * 系统的基础参数不存在
     */
    SYSTEM_NOT_EXIST(9, "SYSTEM_NOT_EXIST"),

    /**
     * 系统异常
     */
    SYSTEM_ERROR(10, "SYSTEM_ERROR"),

    /**
     * 信息不一致
     */
    INFO_UPDATE(11, "信息不一致"),

    /**
     * 超时请求
     */
    TIME_OUT(12, "TIME_OUT"),

    /**
     * 无操作权限
     */
    NO_AUTHORITY(13, "NO_AUTHORITY"),

    /**
     * 信息已修改
     */
    INFO_MODIFY(14, "INFO_MODIFY"),

    /**
     * 信息未修改
     */
    INFO_NO_MODIFY(15, "INFO_NO_MODIFY");

    private int code;

    private String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    @Override
    public String toString() {
        return Integer.toString(code);
    }
}
