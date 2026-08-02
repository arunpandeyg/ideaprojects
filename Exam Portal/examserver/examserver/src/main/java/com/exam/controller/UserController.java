package com.exam.controller;

import com.exam.entities.Role;
import com.exam.entities.User;
import com.exam.entities.UserRole;
import com.exam.exceptions.UserNotFoundException;
import com.exam.repositories.UserRepo;
import com.exam.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepo userRepo;

    //creating user
    @PostMapping("/")
    public User createUser(@RequestBody User user) throws Exception {
        // user.setProfile("default.png");
        Set<UserRole> roles = new HashSet<>();
        Role role = new Role();
        role.setRoleId(121L);
        role.setRoleName("GUEST");

        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);
        roles.add(userRole);
        return this.userService.createUser(user, roles);
    }

    //get user
    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username) {
        return this.userService.getUser(username);
    }

    //delete user by id
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId) {
        this.userService.deleteUser(userId);
    }

    //update user by id
    @PutMapping("/{userId}")
    public ResponseEntity<User> updateByUserId(@RequestBody User user, @PathVariable("userId") Long userId) {
        User updatedUser = userService.updateByUserId(user, userId);
        return new   ResponseEntity<>(updatedUser, HttpStatus.OK);
    }
    /*@PutMapping("/user/{username}")
    User updateUser(@RequestBody User newUser, @PathVariable("username") String username){
        return userRepo.findByUsername(username)
                .map(user -> {
                    user.setUsername(newUser.getUsername());
                    user.setFirstName(newUser.getFirstName());
                    user.setLastName(newUser.getLastName());
                    user.setEmail(newUser.getEmail());
                    user.setPhone(newUser.getPhone());
                    user.setProfile(newUser.getProfile());
                    return userRepo.save(user);

                }).orElseThrow(()->new UserNotFoundException(username));
    }*/


}
