package com.hf.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hf.user.entity.User;
import com.hf.user.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService us;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable Long userId) {
		return us.getUserDetails(userId);
	}
	
	
	
}
