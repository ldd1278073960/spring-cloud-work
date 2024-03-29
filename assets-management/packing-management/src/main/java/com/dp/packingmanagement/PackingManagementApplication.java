package com.dp.packingmanagement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 */
@SpringBootApplication
@MapperScan("com.dp.packingmanagement.mapper")
@EnableDiscoveryClient
public class PackingManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(PackingManagementApplication.class, args);
    }

}
