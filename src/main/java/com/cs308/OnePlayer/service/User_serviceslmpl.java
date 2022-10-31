package com.cs308.OnePlayer.service;

import com.cs308.OnePlayer.repository.User_repository;
import com.cs308.OnePlayer.model.User;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class User_serviceslmpl
        implements User_services {
    @Autowired
    private User_repository UserRepository;

    // Save operation
    @Override
    public User saveUser(User user)
    {
        return UserRepository.save(user);
    }

    // Read operation
    @Override public List<User> fetchUserList()
    {
        return (List<User>)
                UserRepository.findAll();
    }

    // Update operation
    @Override
    public User
    updateUser(User user,
                     Long UserId)
    {
        User userDB
                = UserRepository.findById(UserId)
                .get();

        if (Objects.nonNull(user.getUserName())
                && !"".equalsIgnoreCase(
                user.getUserName())) {
            userDB.setUserName(
                    user.getUserName());
        }

        if (Objects.nonNull(
                user.getUser_MailAddress())
                && !"".equalsIgnoreCase(
                user.getUser_MailAddress())) {
            userDB.setUser_MailAddress(
                    user.getUser_MailAddress());
        }

        if (Objects.nonNull(user.getUser_Password())
                && !"".equalsIgnoreCase(
                user.getUser_Password())) {
            userDB.setUser_Password(
                    user.getUser_Password());
        }

        return UserRepository.save(userDB);
    }

    // Delete operation
    @Override
    public void deleteUserById(Long UserId)
    {
        UserRepository.deleteById(UserId);
    }
}
