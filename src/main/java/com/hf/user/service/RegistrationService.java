package com.hf.user.service;

import org.springframework.stereotype.Service;

import com.hf.user.entity.User;
@Service
public interface RegistrationService {
	User registerUser(User user, String confirmPassword);

}
