package com.dragon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RunAppUserProvider {

	public static void main(String[] args) {
		SpringApplication.run(RunAppUserProvider.class, args);
	}
}
