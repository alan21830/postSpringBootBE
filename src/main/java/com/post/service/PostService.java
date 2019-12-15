package com.post.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.post.dto.PostDto;
import com.post.model.Post;
import com.post.model.User;
import com.post.repository.PostRepository;
import com.post.repository.UserRepository;

@Service
public class PostService {

	@Autowired
	PostRepository postRepository;
	@Autowired
	UserService userService;
	@Autowired
	UserRepository userRepository;
	
	public List<Post> findAllPost()
	{
		
		return postRepository.findAll();
		
	}
	
	public void addPost(PostDto postdto)
	{
		User user=userService.findByUserName(postdto.username) ;
		if(user != null)
		{
			Post post = new Post();
			post.setTitolo(postdto.getTitolo());
			post.setPost(postdto.getPost());
			post.setUser(user);
			
			postRepository.save(post);
		}else
		{
			user = new User();
			user.setPassword("");
			user.setUsername(postdto.username);
			userRepository.save(user);
			Post post = new Post();
			post.setTitolo(postdto.getTitolo());
			post.setPost(postdto.getPost());
			post.setUser(user);
			postRepository.save(post);
		}
	}
		 
		public Optional<Post> findPostById(int id)
		{
			return postRepository.findById(id);
		}
	}

