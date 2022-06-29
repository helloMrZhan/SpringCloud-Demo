package com.zjq.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientProviderApplication.class, args);
	}

}
