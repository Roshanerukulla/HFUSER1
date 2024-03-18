package com.hf.user.feign;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "HFGROUPS", url = "http://localhost:8085") // Update with the actual URL
public interface GroupFeignClient {

    @GetMapping("/api/groups/friends/{userId}")
    List<Long> getFriendUserIds(@PathVariable Long userId);
}
