package com.harshit.codingcontest.repositoryService;

import com.harshit.codingcontest.entity.User;

import java.util.List;
import java.util.Optional;

public interface IUserRepositoryService {

        public List<User> findAll();

        public Optional<User> findById(String id);

        public void delete(User user);

        public User save(User user);
}
