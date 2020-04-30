package com.springMongo.speingMongoProjetc.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	

	@RequestMapping(value = "/test",method = RequestMethod.GET)
	public String name() {
		System.out.println("Welcome to Mongo CRUD ..");
		return "Hello welcome";
	}
	
}
