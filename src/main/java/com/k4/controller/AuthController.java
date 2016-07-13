package com.k4.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

	@RequestMapping(method=RequestMethod.POST)
	public void login() {
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public void logout() {
		
	}
}
