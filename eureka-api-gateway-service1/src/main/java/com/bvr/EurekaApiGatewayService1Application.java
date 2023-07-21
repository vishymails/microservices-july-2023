package com.bvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaApiGatewayService1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApiGatewayService1Application.class, args);
	}

}
