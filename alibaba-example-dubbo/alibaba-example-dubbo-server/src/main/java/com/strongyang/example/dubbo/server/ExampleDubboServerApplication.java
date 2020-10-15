package com.strongyang.example.dubbo.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author yq
 * @Date 2020/10/15 15:38
 * @Description
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ExampleDubboServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExampleDubboServerApplication.class, args);
        System.out.println("###############finish.################");
    }
}
