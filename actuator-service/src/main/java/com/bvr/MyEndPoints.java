package com.bvr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyEndPoints {

	public MyEndPoints() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/mypage")
	public String myString() {
		return "First MicroService Example";
	}
	
	
	@RequestMapping("/second")
	public String sayHello(@RequestParam String name) {
		return "Welcome : " + name;
	}
	
	@RequestMapping("/secondpathvar/{name}")
	public String sayHello2(@PathVariable String name) {
		return "Path Definitions :" + name;
	}
	
	
}
