package com.k4t2.controller;

import javax.ws.rs.FormParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.k4t2.model.User;
import com.k4t2.repository.doma.UserDao;

@RestController("/user")
public class UserController {

	@Autowired
	UserDao userDao;
	
	@RequestMapping(method=RequestMethod.POST)
	public int make(@FormParam("id") String id ,@FormParam("name") String name , @FormParam("pw") String pw) {
		User user = new User();
		user.id =id;
		user.name=name;
		user.pw = pw;
		return userDao.insert(user);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public void invite() {
		System.out.println("user.invite");
	}
}
