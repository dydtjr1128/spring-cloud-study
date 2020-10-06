package com.dydtjr1128.msaproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaProducerApplication.class, args);
	}

}
