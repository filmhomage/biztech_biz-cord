package com.k4t2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {

	@RequestMapping(method=RequestMethod.POST)
	public void make() {
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public void invite() {
		
	}
}
