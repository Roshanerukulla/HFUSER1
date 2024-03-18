package com.hf.user.controller;

import org.springframework.http.ResponseEntity;
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

 private final LoginService loginService;

 public LoginController(LoginService loginService) {
     this.loginService = loginService;
 }

 @PostMapping("/authenticate")
 public ResponseEntity<?> loginUser(@RequestBody LoginRequest loginRequest) {
     User user = loginService.loginUser(loginRequest.getUsername(), loginRequest.getPassword());
     if (user != null) {
         return ResponseEntity.ok(user);
     } else {
         return ResponseEntity.status(401).body("Invalid credentials");
     }
 }
}
