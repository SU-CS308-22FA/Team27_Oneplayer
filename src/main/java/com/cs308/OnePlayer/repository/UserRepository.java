package com.cs308.oneplayer.repository;

import com.cs308.oneplayer.model.user;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends CrudRepository <user,Integer> {

    user findByUsernameAndPassword(String username, String password);
}
