package com.weibian3jue.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/pull")
public class PullData {
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello() {
		return "hello, this is weibian3jue websit";
	}
	
}
