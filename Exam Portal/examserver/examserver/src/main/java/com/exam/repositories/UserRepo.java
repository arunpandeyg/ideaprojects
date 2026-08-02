package com.exam.repositories;

import com.exam.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);
    Optional<User> findById(Long userId);


}
