package com.example.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.exception.ResourceNotFoundException;
import com.example.pojo.User;
import com.example.repository.UserRepository;

@Service
@Transactional
public class UserSeviceImpl implements UserService{

	
	@Autowired
	private UserRepository userRepo;
	
	
	@PostConstruct
	public void init() {
		System.out.println("init ");
	}


	@Override
	public List<User> fetchAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}


	@Override
	public User getUsers(Long id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("jkjk"));
	}


	@Override
	public String deleteUser(Long id) {
		User us = userRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("nhi bhetla"));
		userRepo.delete(us);
		return "dlete";
	}


	@Override
	public String updateUser(User user) {
		if(userRepo.findById(user.getId()) != null) {
			userRepo.save(user);
		}
		return "updated";
	}



	
//	@Override
//	public String deleteUser(Long id) {
//		if(userRepo.existsById(id)) {
//			userRepo.deleteById(id);
//		}
//		return "emp details deleted";
//	}


	

//	@Override
//	public User fetchUserDetails(Long userId) {
//		return userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("hjkhljhl"));
//	}

//	@Override
//	public List<User> fetchAllUsers() {
//		
//		return userRepo.findAll();
//	}
//
//	@Override
//	public User addUser(User user) {
//		// TODO Auto-generated method stub
//		return userRepo.save(user);
//	}	

}
