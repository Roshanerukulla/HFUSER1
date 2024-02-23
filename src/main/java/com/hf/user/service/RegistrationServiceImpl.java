package com.hf.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hf.user.entity.User;
import com.hf.user.repository.UserRepository;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public RegistrationServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User registerUser(User user, String confirmPassword) {
        if (!user.getPassword().equals(confirmPassword)) {
            // Handle mismatch error
            throw new RuntimeException("Password and Confirm Password do not match");
        }

        // Encrypt the password using BCrypt
        String encryptedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encryptedPassword);

        // Additional validation logic if needed
        return userRepository.save(user);
    }
}
