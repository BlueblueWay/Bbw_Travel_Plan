package com.travel.demo.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
    private UserService userService;

    @GetMapping("/greeting")
	public List<User> greeting() {
		System.out.println("greeting server is running");
		return userService.getContainer();
	}

	@GetMapping("/")
	public String Hello() {
		System.out.println("Hello server is running");
		return "Welcome to travel planner";
	}

}