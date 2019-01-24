package com.usoft.b2b.manage.support;

import com.usoft.b2b.manage.domain.UserBaseInfo;

/**
 * 服务器请求时用户信息存放在当前线程中
 * 
 * @author hejq
 * @date 2018-12-26 8:55
 */
public class SystemSession {

	private static ThreadLocal<UserBaseInfo> local = new ThreadLocal<>();

	public static void setUser(UserBaseInfo session) {
		local.set(session);
	}

	public static UserBaseInfo getUser() {
		return local.get();
	}

	public static void clear() {
		local.remove();
	}

}
