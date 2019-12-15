package com.post.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.post.model.Post;
import com.post.model.User;;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{

}
