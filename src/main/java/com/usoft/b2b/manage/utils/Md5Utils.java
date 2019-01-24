package com.usoft.b2b.manage.utils;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

/**
 * @author hejq
 * @date 2018-12-24 16:48
 */
public class Md5Utils {

    private static Md5PasswordEncoder md5PasswordEncoder = new Md5PasswordEncoder();

    public Md5Utils() {
    }

    public static String encode(Object rawPass, Object salt) {
        String pass = rawPass == null ? null : String.valueOf(rawPass);
        salt = salt == null ? "" : salt.toString();
        return md5PasswordEncoder.encodePassword(pass, salt);
    }
}
