package com.javainuse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.domain.Comments;
import com.javainuse.exception.ResourceNotFoundException;
import com.javainuse.repository.CommentsRepository;

@RestController
@RequestMapping("/api")
public class CommentsController {
	
	@Autowired
	CommentsRepository commentRepository;
	
	@GetMapping("/getAllComments")
	public List<Comments> getAllComments()	{	
		return commentRepository.findAll();	
	}
	
	@PostMapping("/createComment")
	public Comments createComment(@RequestBody Comments comment) {
		return commentRepository.save(comment);
	}
	
	@GetMapping("/getCommentById/{id}")
	public Comments getCommentById(@PathVariable (value = "id") Long commentId) {
		return commentRepository.findById(commentId).orElseThrow(() -> new ResourceNotFoundException("comment","id",commentId));
	}
	
	@PutMapping("updateCommentById/{id}")
	public Comments updateCommentById(@PathVariable (value = "id") Long commentId, @RequestBody Comments updatedComment) {
			
		Comments comment1 = commentRepository.findById(commentId).orElseThrow(() -> new ResourceNotFoundException("comment","id",commentId));
		comment1.setPostName(updatedComment.getPostName());
		comment1.setComment(updatedComment.getComment());
		Comments modifedComment = commentRepository.save(comment1);
		return modifedComment;	
	}
	
	@DeleteMapping("/delteComment/{id}")
	public ResponseEntity<?> deleteComment(@PathVariable (value = "id") Long commentId ){
		
	Comments comment = commentRepository.findById(commentId).orElseThrow(() -> new ResourceNotFoundException("Comment", "id", commentId));
	commentRepository.delete(comment);
	return ResponseEntity.ok().build();
	
	}

}
