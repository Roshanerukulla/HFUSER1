package com.hf.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hf.user.dto.AvatarDTO;
import com.hf.user.feign.AvatarFeignClient;
import com.hf.user.service.UserAvatarService;

@RestController
@RequestMapping("/users")
public class UserAvatarController {

    @Autowired
    private UserAvatarService userAvatarService;

    @Autowired
    private AvatarFeignClient avatarFeignClient;

    @PutMapping("/{userId}/{avatarId}")
    public ResponseEntity<String> associateAvatarWithUser(@PathVariable Long userId, @PathVariable Long avatarId) {
        ResponseEntity<AvatarDTO> avatarResponse = avatarFeignClient.getAvatar(avatarId);
        if (avatarResponse.getStatusCode() == HttpStatus.OK) {
            // Avatar exists, associate it with the user
            userAvatarService.associateAvatarWithUser(userId, avatarResponse.getBody());
            return ResponseEntity.ok("Avatar associated with the user successfully");
        } else {
            // Avatar not found
            return ResponseEntity.status(avatarResponse.getStatusCode()).body("Avatar not found");
        }
    }
}
