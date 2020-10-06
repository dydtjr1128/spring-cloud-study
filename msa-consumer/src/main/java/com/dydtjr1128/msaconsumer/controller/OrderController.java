package com.dydtjr1128.msaconsumer.controller;

import com.dydtjr1128.msaconsumer.client.ProductFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final ProductFeignClient productFeignClient;

    @GetMapping("/product")
    public String getProductName() {
        return productFeignClient.getProductName();
    }

}
