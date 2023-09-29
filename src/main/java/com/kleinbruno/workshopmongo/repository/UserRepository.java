package com.kleinbruno.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kleinbruno.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{
	
}
