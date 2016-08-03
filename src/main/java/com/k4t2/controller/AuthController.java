package com.k4t2.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.k4t2.model.AuthResult;

/**
 * 認証を行うControllerです。
 * ユーザーそのものの作成はUserControllerで行われます。
 * 
 * @author ken-kaiho
 */
@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthController {

	@RequestMapping(method=RequestMethod.POST,path = "/{userId}")
	public AuthResult login(@RequestBody String password) {
		
		
		return new AuthResult("OK");
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public void logout() {
		
	}
}
