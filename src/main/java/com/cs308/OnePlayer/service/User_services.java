package com.cs308.OnePlayer.service;

import com.cs308.OnePlayer.model.User;

import java.util.List;

public interface User_services {
    // Save operation
    User saveUser(User user);

    // Read operation
    List<User> fetchUserList();

    // Update operation
    User updateUser(User user,
                    Long UserId);

    // Delete operation
    void deleteUserById(Long UserId);
}
