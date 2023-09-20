package com.fullstack.fullstackbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController("/infy")
public class UserController {

	@GetMapping("checkurl")
	public String checkUrl() {
		return "This is working fine";
	}

}
