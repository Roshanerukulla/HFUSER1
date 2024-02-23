package com.hf.user.controller;

import com.hf.user.entity.User;
import com.hf.user.feign.CoachFeignClient;
import com.hf.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserCoachController {

    @Autowired
    private UserService userService;

    @Autowired
    private CoachFeignClient coachFeignClient;

    @GetMapping("/getcoachinfo/{userId}")
    public String getUserCoachInfo(@PathVariable Long userId) {
        User user = userService.getUserDetails(userId);

        if (user != null && user.getCoachid() != null) {
            String coachName = coachFeignClient.getCoachNameById(Long.parseLong(user.getCoachid()));
            // Assuming you have a getter for coachName in the User entity
            return "Your coach is: " + coachName;
        }

        return "No coach assigned.";
    }

    // Other user-related endpoints...
}
