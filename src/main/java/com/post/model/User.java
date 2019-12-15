package com.post.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "user")
public class User implements Serializable {

	public User() {
		 
	}

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Post> getPost() {
		return post;
	}

	public void setPost(List<Post> post) {
		this.post = post;
	}

	public List<Commenti> getCommenti() {
		return commenti;
	}

	public void setCommenti(List<Commenti> commenti) {
		this.commenti = commenti;
	}

	@Column(name="USERNAME")
	public String username;
	
	@Column(name="PASSWORD")
	public String password;
	
	//@JsonManagedReference
	@OneToMany(fetch = FetchType.EAGER,mappedBy = "user"  )
 	public List<Post> post;
	
	//@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
	public List<Commenti> commenti;
	
}
