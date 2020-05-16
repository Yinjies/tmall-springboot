package com.kirb;

import com.kirb.util.PortUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @program: TMAll_springboot
 * @description: 启动类
 * 测试地址：http://localhost:8080/tmall_springboot/admin
 * 修改 Application, 做如下几个改动
 * 1. 增加注解： @EnableCaching 用于启动缓存
 * 2. 检查端口6379是否启动。 6379 就是 Redis 服务器使用的端口。如果未启动，那么就会退出 springboot。
 * @author: Yin jie
 * @create: 2020-04-08 22:16
 **/
@SpringBootApplication
@EnableCaching
@EnableElasticsearchRepositories(basePackages = "com.kirb.es")
@EnableJpaRepositories(basePackages = {"com.kirb.dao", "com.kirb.pojo"})
@ServletComponentScan
public class Application  {
    static {
        PortUtil.checkPort(6379,"Redis 服务端",true);
        PortUtil.checkPort(9300,"ElasticSearch 服务端",true);
        PortUtil.checkPort(5601,"Kibana 工具", true);
    }
//    extends SpringBootServletInitializer
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(Application.class);
//    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
