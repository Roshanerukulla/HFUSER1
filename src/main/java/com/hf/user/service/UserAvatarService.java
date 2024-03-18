
  package com.hf.user.service;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.stereotype.Service;

import com.hf.user.dto.AvatarDTO;
import com.hf.user.entity.User; import com.hf.user.repository.UserRepository;
  
  import jakarta.persistence.EntityNotFoundException;
  
  @Service public class UserAvatarService {
  
  @Autowired private UserRepository userRepository;
  
  public void associateAvatarWithUser(Long userId, AvatarDTO avatarDTO) { User
  user = userRepository.findById(userId) .orElseThrow(() -> new
  EntityNotFoundException("User not found"));
  
  // Update the user entity with avatar information
  user.setAvatarId(avatarDTO.getId()); // ... other fields if needed
  
  userRepository.save(user); } }
