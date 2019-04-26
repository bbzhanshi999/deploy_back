package com.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 创建配置类AppConfig，配置内容如下：
 * 1、解决跨域 利用cross origin协议
 * 2.配置security相关组件和规则 ：配置加密算法 配置jwt token的生成器，配置对应权限过滤器 配置userDetailService
 */
@Configuration

public class AppConfig  implements WebMvcConfigurer {



    /**
     * 全局配置跨域
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") //那些请求需要跨域
                .allowedOrigins("*") //代表允许所有的地址和端口对本服务进行访问
                .allowedHeaders("token")  //允许请求有哪些自定义的请求头
                .exposedHeaders("token")  //返回的响应头
                .allowCredentials(true) //是否允许密钥
                .allowedMethods("DELETE","POST","GET","PUT") //允许请求方法
                .maxAge(3600); //请求超时时间1小时，以秒为单位
    }




}
