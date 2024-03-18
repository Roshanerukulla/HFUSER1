package com.hf.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hf.user.service.UserGroupService;


@RestController
@RequestMapping("/api/users")
public class UsegroupController {
	@Autowired
    private UserGroupService userService;

    // Other endpoints...
	@GetMapping("/viewmyfriends/{userId}")
    public List<String> getFriendNames(@PathVariable Long userId) {
        return userService.getFriendNames(userId);
    }
	
	
	
}
