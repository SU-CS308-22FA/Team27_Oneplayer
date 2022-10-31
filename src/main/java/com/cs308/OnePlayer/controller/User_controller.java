package com.cs308.OnePlayer.controller;

import com.cs308.OnePlayer.model.User;
import com.cs308.OnePlayer.service.User_services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Annotation
@RestController

public class User_controller {

    // Annotation
    @Autowired
    private User_services UserService;

    // Save operation
    @PostMapping("/users")
    public User saveUser(
            @RequestBody User user)
    {
        return UserService.saveUser(user);
    }

    // Read operation
    @GetMapping("/users")
    public List<User> fetchUserList()
    {
        return UserService.fetchUserList();
    }

    // Update operation
    @PutMapping("/users/{id}")
    public User
    updateUser(@RequestBody User user,
                     @PathVariable("id") Long UserId)
    {
        return UserService.updateUser(
                user, UserId);
    }

    // Delete operation
    @DeleteMapping("/users/{id}")
    public String deleteUserById(@PathVariable("id")
                                       Long UserId)
    {
        UserService.deleteUserById(
                UserId);
        return "Deleted Successfully";
    }

}
