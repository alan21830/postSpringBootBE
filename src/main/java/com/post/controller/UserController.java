package com.post.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.post.model.User;
import com.post.service.UserService;

@RestController
//@CrossOrigin 
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	UserService userService;
	
	
    @RequestMapping("user")
	
	
	
	public List<User> getUser()
	{
		return userService.findAllUser();
	}
	
	 
    @RequestMapping(value = "user" , method = RequestMethod.POST)
	public void addUser(@RequestBody User user)
	{
		
		userService.addUser(user);
	}
	
}
