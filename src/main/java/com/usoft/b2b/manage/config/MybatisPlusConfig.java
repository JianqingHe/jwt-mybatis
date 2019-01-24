package com.usoft.b2b.manage.config;
 
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MybatisPlus配置
 *
 * @author hejq
 * @date 2018-12-24 17:26
 */
@EnableTransactionManagement
@Configuration
@MapperScan({"com.usoft.b2b.manage.dao", "com.usoft.b2b.manage.mapper"})
public class MybatisPlusConfig {
 
    /**
     * mybatis-plus分页插件<br>
     * 文档：http://mp.baomidou.com<br>
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
 
}
