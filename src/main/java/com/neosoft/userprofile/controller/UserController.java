package com.neosoft.userprofile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.userprofile.entity.User;
import com.neosoft.userprofile.service.UserProfileService;

@RestController
public class UserController {
	
	@Autowired
	private UserProfileService userService;
	
	@PostMapping(path = "/user")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@GetMapping(path = "/user/{userId}")
	public User getUserById(@PathVariable("userId") Long userId) {
		return userService.getUserById(userId);
	}
	
	@GetMapping(path = "/user")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}
	@PutMapping(path="/user/{userId}")
	public User updateUser(@PathVariable("UserId") Long userId) {
		return userService.save
	}
	@DeleteMapping(path="/user/{userId}")
	public void deleteUser(@PathVariable("userId") Long userId) {
		return userService.d
	}
	@GetMapping("/health")
	public String health() {
		return "OK";
	}

}
