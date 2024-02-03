package com.hf.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.hf.user.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}