package com.usoft.b2b.manage.bean;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.*;

/**
 * 封装返回数据格式
 *
 * @author hejq
 * @date 2018-10-22 9:15
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Data
@Accessors(chain = true)
public class ResultMap<T> implements Serializable {

    /**
     * 返回状态码
     */
    private int code;

    /**
     * 返回数据
     */
    private Object data;

    /**
     * 消息
     */
    private String message;

    /**
     * 是否成功
     */
    private boolean success;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public ResultMap() {

    }

    /**
     * 根据状态返回信息
     *
     * @param code 状态码
     */
    public ResultMap(int code) {
        if (ResultCode.OK.code() == code) {
            this.success = true;
            this.message = ResultCode.OK.message();
        } else {
            this.success = false;
            this.message = ResultCode.ERROR.message();
        }
        this.code = code;
        this.data = null;
    }


    /**
     * 通过传入数据封装返回内容
     *
     * @param code 状态码
     * @param message message提示
     * @param data 内容
     */
    public ResultMap(int code, String message, T data) {
        if (ResultCode.OK.code() == code) {
            this.success = true;
        } else {
            this.success = false;
        }
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 通过传入数据封装返回内容
     *
     * @param code 状态码
     * @param message message提示
     */
    public ResultMap(int code, String message) {
        if (ResultCode.OK.code() == code) {
            this.success = true;
        } else {
            this.success = false;
        }
        this.code = code;
        this.message = message;
    }

    /**
     * 返回成功
     *
     * @param message 消息提示
     * @return ResultMap
     */
    public static ResultMap success(String message) {
        return new ResultMap<>(ResultCode.OK.code(), message, null);
    }

    /**
     * 返回成功
     *
     * @return ResultMap
     */
    public static ResultMap<Object> success(Object data) {
        return new ResultMap<>(ResultCode.OK.code(), ResultCode.OK.message(), data);
    }

    /**
     * 返回成功
     *
     * @return ResultMap
     */
    public static ResultMap<Object> success() {
        return new ResultMap<>(ResultCode.OK.code(), ResultCode.OK.message(), null);
    }


    /**
     * 返回失败
     *
     * @param e 异常
     * @return ResultMap
     */
    public static ResultMap<Object> error(Exception e) {
        return new ResultMap<>(ResultCode.ERROR.code(), e.getMessage(), null);
    }

    /**
     * 返回失败
     *
     * @return ResultMap
     */
    public static ResultMap<Object> error() {
        return new ResultMap<>(ResultCode.ERROR.code(), ResultCode.ERROR.message(), null);
    }
}
