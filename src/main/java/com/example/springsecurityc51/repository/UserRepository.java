package com.example.springsecurityc51.repository;

import com.example.springsecurityc51.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
