package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@RequestMapping("/hello")
	public String display(){
		
		return "Controller";
	}
	
	@RequestMapping(value = "/hello2", method = { RequestMethod.POST  }, headers = {"Content-type=application/json"})
	public String display2 (){
		
		return "Controller";
	}
}
