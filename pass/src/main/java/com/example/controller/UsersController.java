package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/user")
public class UsersController {
		
		@Autowired
		private UserService userService;
	

		@GetMapping
		public List<User> getAllUsers(){
			return userService.fetchAllUsers();
		}
		
		@PostMapping
		public User addUser(@RequestBody User user) {
			return userService.addUser(user);
		}
		
		@GetMapping("/{id}")
		public User getUserById(@PathVariable Long id) {
			return userService.getUsers(id);
		}
		
		@DeleteMapping("/{id}")
		public String deleteById(@PathVariable Long id) {
			return userService.deleteUser(id);
		}
		
		@PutMapping
		public String updateuser(@RequestBody User user) {
			return userService.updateUser(user);
		}
		
		
//		@GetMapping("/{userId}")
//		public User getGenDetails(@PathVariable Long userId) {
//			
//			return userService.fetchUserDetails(userId);
//		}
	
}
	
