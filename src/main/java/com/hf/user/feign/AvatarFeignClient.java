
  package com.hf.user.feign;
  
  import org.springframework.cloud.openfeign.FeignClient; import
  org.springframework.http.ResponseEntity; import
  org.springframework.web.bind.annotation.GetMapping; import
  org.springframework.web.bind.annotation.PathVariable;

import com.hf.user.dto.AvatarDTO;
  
  @FeignClient(name = "HFAvatar", url = "http://localhost:8082")
  public interface
  AvatarFeignClient {
  
  @GetMapping("/avatars/{avatarId}") ResponseEntity<AvatarDTO>
  getAvatar(@PathVariable Long avatarId); }
  
 
