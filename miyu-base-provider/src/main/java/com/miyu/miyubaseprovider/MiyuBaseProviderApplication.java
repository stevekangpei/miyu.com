package com.miyu.miyubaseprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MiyuBaseProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiyuBaseProviderApplication.class, args);
	}

}
