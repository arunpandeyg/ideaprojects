package com.exam.services;

import com.exam.entities.User;
import com.exam.entities.UserRole;

import java.util.Set;

public interface UserService {
    //create
     User createUser(User user, Set<UserRole> userRoles) throws Exception;
    //get user
    User getUser(String username);
    //delete user by id
    void deleteUser(Long userId);

    //update user
    User updateByUserId(User user, Long userId);

}
