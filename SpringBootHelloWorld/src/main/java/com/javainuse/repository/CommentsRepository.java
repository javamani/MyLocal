package com.javainuse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javainuse.domain.Comments;

public interface CommentsRepository extends JpaRepository<Comments, Long>{

}
