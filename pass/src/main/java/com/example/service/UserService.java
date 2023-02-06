package com.example.service;

import java.util.List;

import com.example.pojo.User;

public interface UserService {

//	User fetchUserDetails(Long userId);

	List<User> fetchAllUsers();

	User addUser(User user);

	User getUsers(Long id);

	String deleteUser(Long id);

	String updateUser(User user);




}
