package com.kleinbruno.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kleinbruno.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{
	
}
