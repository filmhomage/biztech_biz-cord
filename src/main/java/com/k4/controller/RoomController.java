package com.k4.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.k4.dao.UserDao;
import com.k4.entity.User;

@RestController
@CrossOrigin("*")
public class RoomController {

	@Autowired
	UserDao userDao;
	
	
	@RequestMapping(path = "/", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON})
	public Map<String, Integer> addUser(@RequestBody User user) {
		int id = userDao.insert(user);
		Map<String, Integer> data = new HashMap<>();
		data.put("id", id);
		return data;
	}
	
}
