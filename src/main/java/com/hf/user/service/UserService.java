package com.hf.user.service;

import org.springframework.stereotype.Service;

import com.hf.user.entity.User;

@Service
public interface UserService {
 public User getUserDetails(Long userId);
 Long getUserId(Long userId);
}
