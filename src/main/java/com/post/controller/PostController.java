package com.post.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import com.post.dto.PostDto;
import com.post.model.Post;
import com.post.model.User;
import com.post.service.PostService;
import com.post.service.UserService;

@RestController
//@CrossOrigin 
@CrossOrigin(origins = "*")
public class PostController {

	@Autowired
	PostService postService;
	
	
    @RequestMapping("post")
    public List<Post> getPost()
	{
		return postService.findAllPost();
	}
	
	 
    @RequestMapping(value = "postdto" , method = RequestMethod.POST)
	public void addUser(@RequestBody PostDto postdto)
	{
		
		postService.addPost(postdto);
	}

    @RequestMapping(value = "findbyidpost/{id}" )
    public Optional<Post> byId(@PathVariable int id)
    {
    	return postService.findPostById(id);
    }
}
