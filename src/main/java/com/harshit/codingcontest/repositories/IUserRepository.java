package com.harshit.codingcontest.repositories;

import com.harshit.codingcontest.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface IUserRepository extends MongoRepository<User,String> {
}
