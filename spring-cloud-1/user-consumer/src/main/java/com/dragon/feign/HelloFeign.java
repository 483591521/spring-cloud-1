package com.dragon.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("user-provider")
public interface HelloFeign {
	
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name);
}
