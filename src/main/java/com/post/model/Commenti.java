package com.post.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="commenti")
public class Commenti {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
	
	@Column(name="COMMENTO")
	public String commento;
	
	@ManyToOne()
	@JoinColumn(name = "IDPOST")
	public Post post;
	
	@ManyToOne()
	@JoinColumn(name = "ID_USER")
	public User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCommento() {
		return commento;
	}

	public void setCommento(String commento) {
		this.commento = commento;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
