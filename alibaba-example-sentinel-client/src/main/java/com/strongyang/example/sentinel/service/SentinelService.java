package com.strongyang.example.sentinel.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.stereotype.Service;

/**
 * @Author yq
 * @Date 2020/10/15 15:10
 * @Description 定义资源点@SentinelResource的使用
 */
@Service
public class SentinelService {

    /**
     * 限流阻塞
     * @return
     */
    @SentinelResource(value = "sentinelTestC", blockHandler = "blockHandler")
    public String sentinelTestC() {
        return "testC!";
    }

    /**
     * 熔断降级
     * @return
     */
    @SentinelResource(value = "sentinelTestD", fallback = "fallbackHandler")
    public String sentinelTestD() {
        throw new RuntimeException("发生异常");
    }

    public void blockHandler(String str, BlockException ex) {
        System.out.println( "blockHandler：" + str + ex);
    }

    public void fallbackHandler(String str, BlockException ex) {
        System.out.println( "fallbackHandler：" + str + ex);
    }
}
