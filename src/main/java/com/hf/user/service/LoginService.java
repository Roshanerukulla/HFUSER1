package com.hf.user.service;

import org.springframework.stereotype.Service;

import com.hf.user.entity.User;

//LoginService.java
@Service
public interface LoginService {
 User loginUser(String username, String password);
}
