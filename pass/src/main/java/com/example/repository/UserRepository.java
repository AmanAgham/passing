package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pojo.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
