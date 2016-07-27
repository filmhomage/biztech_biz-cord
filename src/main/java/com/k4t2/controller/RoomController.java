package com.k4t2.controller;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.k4t2.model.User;
import com.k4t2.repository.doma.UserDao;

@RestController
@RequestMapping("/room")
@CrossOrigin("*")
public class RoomController {

	/**
	 * |★|部屋一覧|
	 * |★|部屋作成|
	 * ||部屋編集|
	 * |★|部屋参加|
	 * ||部屋退出|
	 */

	@Autowired
	UserDao userDao;
	
	
	@RequestMapping(method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON})
	public Map<String, Integer> addUser(@RequestBody User user) {
		int id = userDao.insert(user);
		Map<String, Integer> data = new HashMap<>();
		data.put("id", id);
		return data;
	}

	@RequestMapping(method= RequestMethod.GET)
	public void list() {

	}

	@RequestMapping(method= RequestMethod.POST)
	public void make() {

	}

	@RequestMapping(method= RequestMethod.PUT)
	public void manage() {

	}

	@RequestMapping(path = "/{id}/{userId}", method= RequestMethod.POST)
	public void rideOn(@PathVariable("id") long roomId, @PathVariable("userId") long userId) {

	}

	@RequestMapping(path = "/{id}/{userId}", method= RequestMethod.DELETE)
	public void rideOff() {

	}

}
