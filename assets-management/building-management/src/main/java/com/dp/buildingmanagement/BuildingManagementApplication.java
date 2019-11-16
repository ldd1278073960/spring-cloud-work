package com.dp.buildingmanagement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 */
@SpringBootApplication
@MapperScan("com.dp.buildingmanagement.mapper")
@EnableDiscoveryClient
public class BuildingManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuildingManagementApplication.class, args);
    }
}
