package com.hf.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hf.user.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);

    @Query("SELECT u.username FROM User u WHERE u.id IN :ids")
    List<String> findUsernamesByIds(@Param("ids") List<Long> ids);
}
