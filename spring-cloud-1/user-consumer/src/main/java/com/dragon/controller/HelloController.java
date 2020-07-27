package com.dragon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dragon.feign.HelloFeign;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class HelloController {

	@Autowired
	private HelloFeign helloFeign;
	
	@RequestMapping("/hello/{name}")
	@HystrixCommand(fallbackMethod = "fallbackHello")
	String hello(@PathVariable("name") String name) {
		return helloFeign.hello(name);
	}
	
	// 断路器的方法，返回值要和方法一致，参数也一致
	// 注意一个BUG，断路器刚启动时，第一次就访问到断路器，不正常，第一次进入断路器不算数
	public String fallbackHello(String name) {
		return "chen"; // 当发生异常时，直接返回默认值，这种形式也称为降级
	}
}
