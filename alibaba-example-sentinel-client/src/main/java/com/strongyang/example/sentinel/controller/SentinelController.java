package com.strongyang.example.sentinel.controller;

import com.strongyang.example.sentinel.service.SentinelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：yq
 * @ Date       ：Created in 15:42 2020/10/14
 * @ Description：
 */
@RestController
public class SentinelController {
    @Autowired
    private SentinelService sentinelService;

    @GetMapping("/sentinelTestA")
    public String sentinelTestA() {
        return "success A!";
    }

    @GetMapping("/sentinelTestB")
    public String sentinelTestB() {
        return "success B!";
    }

    @GetMapping("/sentinelTestC")
    public String sentinelTestC() {
        return sentinelService.sentinelTestC();
    }

    @GetMapping("/sentinelTestD")
    public String sentinelTestD() {
        return sentinelService.sentinelTestD();
    }
}
