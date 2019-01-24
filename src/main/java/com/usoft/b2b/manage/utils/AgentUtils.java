package com.usoft.b2b.manage.utils;


import javax.servlet.http.HttpServletRequest;

/**
 * IP获取工具
 * @author hejq
 * @date 2018-12-27 17:27
 */
public class AgentUtils {
    
    private static final String UNKNOWN = "unknown";

    private static final String LOCAL_IP = "0:0:0:0:0:0:0:1";

    private static final int MAX_IP_LENGTH = 15;

    private static final String COMMA_SYMBOL = ",";

    public AgentUtils() {
    }

    public static String getIp(HttpServletRequest request) {
        String ipAddress;
        ipAddress = request.getHeader("X-Forwarded-For");
        if (ipAddress == null || ipAddress.length() == 0 || UNKNOWN.equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("Proxy-Client-IP");
        }

        if (ipAddress == null || ipAddress.length() == 0 || UNKNOWN.equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("WL-Proxy-Client-IP");
        }

        if (ipAddress == null || ipAddress.length() == 0 || UNKNOWN.equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getRemoteAddr();
        }

        if (ipAddress != null && ipAddress.length() > MAX_IP_LENGTH && ipAddress.indexOf(COMMA_SYMBOL) > 0) {
            ipAddress = ipAddress.substring(0, ipAddress.indexOf(","));
        }

        if (ipAddress != null && LOCAL_IP.equals(ipAddress)) {
            ipAddress = "127.0.0.1";
        }

        return ipAddress;
    }

    public static String getHost(HttpServletRequest request) {
        String url = request.getRequestURL().toString();
        return url.substring(0, url.length() - request.getRequestURI().length()) + request.getContextPath() + "/";
    }

    public static String getIpString(HttpServletRequest request) {
        String ipAddress = getIp(request);
        return ipAddress.replaceAll(".", "");
    }
}
