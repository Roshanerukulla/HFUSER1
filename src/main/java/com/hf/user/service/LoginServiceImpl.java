package com.hf.user.service;

//LoginServiceImpl.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hf.user.entity.User;
import com.hf.user.repository.UserRepository;

@Service
public class LoginServiceImpl implements LoginService {

 @Autowired
 private UserRepository userRepository;

 @Override
 public User loginUser(String username, String password) {
     User user = userRepository.findByUsername(username);

     if (user != null && user.getPassword().equals(password)) {
         // Passwords match, authentication successful
         return user;
     } else {
         //Username not found or password does not match"
         return null;
     }
 }
}
