package com.cs308.OnePlayer.repository;

import com.cs308.OnePlayer.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface User_repository extends JpaRepository<User, Long> {
}
