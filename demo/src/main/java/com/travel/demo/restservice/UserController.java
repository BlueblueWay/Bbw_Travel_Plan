package com.travel.demo.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
    private UserService userService;

    @GetMapping("/greeting")
	public List<User> greeting() {
		System.out.println("greeting server is running");
		return userService.getAllUser();
	}

	@GetMapping("/")
	public String Hello() {
		System.out.println("Hello server is running");
		return "Welcome to travel planner";
	}

	@GetMapping("/user")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/user")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/user/{id}")
	public void updateUser(@RequestBody User user, @PathVariable long id) {
		userService.updateUser(user,id);
	}



}