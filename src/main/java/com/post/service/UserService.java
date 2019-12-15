package com.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.post.model.User;
import com.post.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public List<User> findAllUser()
	{
		
		return userRepository.findAll();
		
	}
	public void  addUser(User user)
	{
		
		  userRepository.save(user);
		
	}
	
	public User findByUserName(String username)
	{
		return userRepository.findByUsername(username);
	}
}
