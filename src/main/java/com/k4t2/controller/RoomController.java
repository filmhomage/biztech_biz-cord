package com.k4t2.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.k4t2.model.Room;
import com.k4t2.model.User;
import com.k4t2.repository.doma.RoomDao;
import com.k4t2.repository.doma.UserDao;

@Controller
@RestController
@RequestMapping("/room")
@CrossOrigin("*")
public class RoomController {

	/**
	 * |★|部屋一覧| |★|部屋作成| ||部屋編集| |★|部屋参加| ||部屋退出|
	 */

	@Autowired
	RoomDao roomDao;

	@RequestMapping(method = RequestMethod.GET)
	public List<Room> list() {
		List<Room> listRoom = roomDao.selectRoom();
		return listRoom;
	}

	@RequestMapping(method = RequestMethod.POST)
	public int make(@RequestBody Room room) {
		return roomDao.insertRoom(room);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public void manage() {
	}

	@RequestMapping(path = "/{id}/{userId}", method = RequestMethod.POST)
	public void rideOn(@PathVariable("id") long roomId, @PathVariable("userId") long userId) {

	}

	@RequestMapping(path = "/{id}/{userId}", method = RequestMethod.DELETE)
	public void rideOff() {

	}

}
