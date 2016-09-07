package com.k4t2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.k4t2.model.AuthResult;
import com.k4t2.model.User;
import com.k4t2.repository.doma.UserDao;

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

	@Autowired
	UserDao userDao;
	
	@RequestMapping(method=RequestMethod.POST,path = "/{id}")
	public AuthResult login(@RequestBody String password, @PathVariable("id") String id) {
		
		User target = userDao.selectById(id);
		
		if (target.pw != null && !target.pw.equals(password)){
			return new AuthResult("NG");			
		}
		
		return new AuthResult("OK");
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public void logout() {
		
	}
}
