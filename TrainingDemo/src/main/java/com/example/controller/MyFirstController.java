package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {

	@RequestMapping("/hello")
	public String sayHello(){
		return "Hello Spring boot";
	}
}
