package com.dzigncode.mongodb.springbootmongodb.repository;

import com.dzigncode.mongodb.springbootmongodb.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users, Integer> {
}
