package com.usoft.b2b.manage.utils;

import java.util.UUID;

/**
 * UUID生成方法
 *
 * @author hejq
 * @date 2018-12-19 16:00
 */
public class UuidUtils {

    /**
     * 利用UUID生成随机字符串
     *
     * @return UUID生成的随机字符串
     */
    public static String uuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
