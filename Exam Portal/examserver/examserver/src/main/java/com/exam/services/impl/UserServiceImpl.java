package com.exam.services.impl;

import com.exam.entities.User;
import com.exam.entities.UserRole;
import com.exam.repositories.RoleRepo;
import com.exam.repositories.UserRepo;
import com.exam.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private  RoleRepo roleRepo;


   //creating user
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
        User usr = this.userRepo.findByUsername(user.getUsername());
        if (usr != null){
          throw new Exception("User already present  !!"+user);
        }
        else {
            for (UserRole ur : userRoles){
                roleRepo.save(ur.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            usr = this.userRepo.save(user);
        }
        return usr;
    }
//getting user by username
    @Override
    public User getUser(String username) {

        return this.userRepo.findByUsername(username);
    }

    @Override
    public void deleteUser(Long userId) {
        this.userRepo.deleteById(userId);
    }

    @Override
    public User updateByUserId(User user, Long userId) {
        return userRepo.save(user);
    }


}
