package com.wvnew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class RunAppUserZuul {

	public static void main(String[] args) {
		SpringApplication.run(RunAppUserZuul.class, args);
	}
}
