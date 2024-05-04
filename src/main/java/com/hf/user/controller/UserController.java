package com.hf.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	@GetMapping("/{userId}/id")
	public ResponseEntity<Long> getUserId(@PathVariable Long userId) {
	    Long fetchedUserId = us.getUserId(userId);
	    if (fetchedUserId == null) {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	    }
	    return ResponseEntity.ok(fetchedUserId);
	}
	
	@GetMapping("/{userId}/username")
	public String getUserName(@PathVariable Long userId) {
		return us.getUsername(userId);
	}
	
}
