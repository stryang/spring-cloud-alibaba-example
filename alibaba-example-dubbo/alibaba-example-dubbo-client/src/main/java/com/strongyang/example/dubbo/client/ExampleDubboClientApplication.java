package com.strongyang.example.dubbo.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author yq
 * @Date 2020/10/15 16:17
 * @Description
 */
@SpringBootApplication
public class ExampleDubboClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExampleDubboClientApplication.class, args);
        System.out.println("###############finish.################");
    }
}
