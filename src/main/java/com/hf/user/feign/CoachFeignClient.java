package com.hf.user.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "HFCoach", url = "http://localhost:8082") 
public interface CoachFeignClient {

    @GetMapping("/api/coaches/{coachId}") 
    String getCoachNameById(@PathVariable Long coachId);
}
