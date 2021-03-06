package com.strongyang.example.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author yq
 * @Date 2020/10/14 15:27
 * @Description
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ExampleSentinelClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExampleSentinelClientApplication.class, args);
        System.out.println("###############finish.################");
    }
}
