package com.example.springsecurityexampledemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class WelcomeController {
	@RequestMapping("/")
	public String  test() {
		return "hello";
	}
	@RequestMapping("/user")
	public String user() {
		return "welcome user";
	}
	@RequestMapping("/admin")
	public String admin() {
		return "welcome admin";
	}
	

}
