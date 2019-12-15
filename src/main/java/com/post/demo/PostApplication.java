package com.post.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.post")
@EnableJpaRepositories("com.post.repository")
@EntityScan("com.post.model")
public class PostApplication {

	

	public static void main(String[] args) {
		SpringApplication.run(PostApplication.class, args);
	}

}
