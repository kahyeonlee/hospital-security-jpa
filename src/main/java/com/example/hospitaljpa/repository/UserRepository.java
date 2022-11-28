package com.example.hospitaljpa.repository;

import com.example.hospitaljpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    public Optional<User> findByUserName(String username);


}
