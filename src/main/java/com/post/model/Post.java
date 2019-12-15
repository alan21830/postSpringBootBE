package com.post.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "post")
public class Post {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Commenti> getCommenti() {
		return commenti;
	}

	public void setCommenti(List<Commenti> commenti) {
		this.commenti = commenti;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	@Column(name = "POST")
	public String post;
	
	@Column(name = "TITOLO")
	public String titolo;
	
	@ManyToOne
	@JoinColumn(name ="IDUSER" )
	@JsonBackReference
	public User user;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "post")
	public List<Commenti> commenti;
}
