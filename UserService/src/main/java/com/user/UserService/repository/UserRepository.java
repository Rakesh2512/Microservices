package com.user.UserService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.UserService.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
