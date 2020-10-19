package com.strongyang.example.seata.business.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author yq
 * @Date 2020/10/19 16:00
 * @Description
 */
@FeignClient("example-seata-storage-service")
public interface StorageService {

    @GetMapping(path = "/storage/{commodityCode}/{count}")
    String storage(@PathVariable("commodityCode") String commodityCode,
                   @PathVariable("count") int count);

}
