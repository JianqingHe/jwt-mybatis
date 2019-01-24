package com.usoft.b2b.manage.bean;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.*;
import java.util.List;

/**
 * 分页返回结果集
 *
 * @author hejq
 * @date 2018-12-24 17:32
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ResultPage<T> extends Page<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 定义返回成功标识
     */
    private static final String SUCCESS = "success";

    /**
     * 成功状态码
     */
    private static final int SUCCESS_CODE = 0;

    /**
     * 失败状态码
     */
    public static final int FAIL_CODE = 1;

    /**
     * 消息
     */
    private String msg = SUCCESS;

    /**
     * 状态码
     */
    private int code = SUCCESS_CODE;

    /**
     * 内容
     */
    private List<T> content;

    public static String getSUCCESS() {
        return SUCCESS;
    }

    public static int getSuccessCode() {
        return SUCCESS_CODE;
    }

    public static int getFailCode() {
        return FAIL_CODE;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> data) {
        this.content = data;
    }

    public ResultPage() {
        super();
    }

    public ResultPage(Throwable e) {
        super();
        this.msg = e.toString();
        this.code = FAIL_CODE;
    }

    public ResultPage(Page<T> data) {
        super();
        this.content = data.getRecords();
        this.code = SUCCESS_CODE;
        this.msg = SUCCESS;
    }

    public ResultPage(long current, long size) {
        super(current, size);
    }

    public ResultPage<T> addContent(ResultPage<T> page, List<T> content) {
        page.setContent(content);
        return page;
    }
}
