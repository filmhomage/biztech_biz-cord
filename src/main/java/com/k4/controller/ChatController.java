package com.k4.controller;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/talk")
public class ChatController {

	@RequestMapping(method=RequestMethod.GET)
	public void talk() {
		
	}
	
	@RequestMapping(method=RequestMethod.POST, consumes = {MediaType.MULTIPART_FORM_DATA})
	public void talk(@RequestBody Object body) {
		
	}
}
