package com.bvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaApiGatewayService2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApiGatewayService2Application.class, args);
	}

}
