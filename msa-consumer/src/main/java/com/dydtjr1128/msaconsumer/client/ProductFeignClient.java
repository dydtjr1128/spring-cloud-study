package com.dydtjr1128.msaconsumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/*
URL 명시 시 > 순수하게 Feign Client로 동작@FeignClient(name = "${producer.server.name}", url="http://localhost:8081")
URL 명시하지 않을 시 > Feign + Ribbon + Eureka 모드로 동작, 서버 호출은
 */
@FeignClient(name = "${producer.server.name}")
public interface ProductFeignClient {

    @GetMapping(value = "/api/v1/product/name")
    String getProductName();
}
