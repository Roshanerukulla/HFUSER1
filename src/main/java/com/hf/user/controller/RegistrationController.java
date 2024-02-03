package com.hf.user.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hf.user.dto.RegistrationRequest;
import com.hf.user.entity.User;
import com.hf.user.service.RegistrationService;

@RestController
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/register")
    public User registerUser(@RequestBody RegistrationRequest registrationRequest) {
        User user = new User();
        user.setUsername(registrationRequest.getUsername());
        user.setPassword(registrationRequest.getPassword());
        user.setFirstName(registrationRequest.getFirstName());
        user.setLastName(registrationRequest.getLastName());
        user.setEmailId(registrationRequest.getEmailId());
        user.setDob(registrationRequest.getDob());
        user.setConfirmPassword(registrationRequest.getConfirmPassword());

        return registrationService.registerUser(user, registrationRequest.getConfirmPassword());
    }
}