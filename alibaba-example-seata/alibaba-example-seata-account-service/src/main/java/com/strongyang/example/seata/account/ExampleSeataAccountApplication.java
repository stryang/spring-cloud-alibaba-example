package com.strongyang.example.seata.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author yq
 * @Date 2020/10/19 16:00
 * @Description
 */
@EnableDiscoveryClient
@SpringCloudApplication
public class ExampleSeataAccountApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExampleSeataAccountApplication.class, args);
        System.out.println("###############finish.################");
    }
}
