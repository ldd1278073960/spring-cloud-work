package com.dubbo.information;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.dubbo.information.mapper")
public class OwnerInformationApplication {

    public static void main(String[] args) {
        SpringApplication.run(OwnerInformationApplication.class, args);
    }

}
