package com.post.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.post.model.Commenti;
import com.post.model.User;;

@Repository
public interface CommentiRepository extends JpaRepository<Commenti, Integer>{

}
