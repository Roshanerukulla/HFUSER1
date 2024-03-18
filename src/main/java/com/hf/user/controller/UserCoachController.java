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

        if (user != null && user.getCoachId() != null) {
            String coachName = coachFeignClient.getCoachNameById((user.getCoachId()));
            // Assuming you have a getter for coachName in the User entity
            return "Your coach is: " + coachName;
        }

        return "No coach assigned.";
    }
    @GetMapping("/getcoachidinfo/{userId}")
    public Long getUserCoachidInfo(@PathVariable Long userId) {
        User user = userService.getUserDetails(userId);

       
            return user.getCoachId();
        
    }


    // Other user-related endpoints...
}
