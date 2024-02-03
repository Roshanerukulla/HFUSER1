package com.hf.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hf.user.entity.User;
import com.hf.user.entity.UserDao;

@Service
public class RegistrationServiceImpl implements RegistrationService {
    @Autowired
    private UserDao userDao;

    @Override
    public User registerUser(User user, String confirmPassword) {
        if (!user.getPassword().equals(confirmPassword)) {
            // Handle mismatch error
            throw new RuntimeException("Password and Confirm Password do not match");
        }

        // Additional validation logic if needed
        return userDao.save(user);
    }
}
