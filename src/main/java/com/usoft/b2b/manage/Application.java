package com.usoft.b2b.manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * SpringBoot启动类
 * 
 * @author hejq
 * @date 2018-12-17 10:39
 */
@SpringBootApplication
@MapperScan({"com.usoft.b2b.manage.dao", "com.usoft.b2b.manage.mapper"})
@Configuration
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(Application.class, args);
    }
}
