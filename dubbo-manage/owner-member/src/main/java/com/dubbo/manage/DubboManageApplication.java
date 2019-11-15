package com.dubbo.manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.dubbo.manage.mapper")
public class DubboManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboManageApplication.class, args);
    }

}
