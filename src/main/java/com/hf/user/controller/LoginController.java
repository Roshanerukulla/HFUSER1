package com.hf.user.controller;

//LoginController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hf.user.dto.LoginRequest;
import com.hf.user.entity.User;
import com.hf.user.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

 @Autowired
 private LoginService loginService;

 @PostMapping("/authenticate")
 public User loginUser(@RequestBody LoginRequest loginRequest) {
     return loginService.loginUser(loginRequest.getUsername(), loginRequest.getPassword());
 }
}
