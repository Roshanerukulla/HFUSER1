package com.hf.user.service;

//LoginServiceImpl.java
// LoginServiceImpl.java
//LoginServiceImpl.java
//LoginServiceImpl.java
//LoginServiceImpl.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hf.user.entity.User;
import com.hf.user.repository.UserRepository;

import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService {

 private final UserRepository userRepository;

 @Autowired
 public LoginServiceImpl(UserRepository userRepository) {
     this.userRepository = userRepository;
 }

 @Override
 public User loginUser(String username, String password) {
     Optional<User> userOptional = Optional.ofNullable(userRepository.findByUsername(username));

     // Your existing login logic without security.core

     return userOptional.orElse(null);
 }
}
