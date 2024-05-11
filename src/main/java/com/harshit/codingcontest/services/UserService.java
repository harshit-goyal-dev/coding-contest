package com.harshit.codingcontest.services;

import com.harshit.codingcontest.dto.UpdateUserRequestDto;
import com.harshit.codingcontest.dto.UserRequestDto;
import com.harshit.codingcontest.entity.User;
import com.harshit.codingcontest.exceptions.UserNotFoundException;
import com.harshit.codingcontest.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import java.lang.constant.Constable;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService{

    @Autowired
    private IUserRepository userRepository;

    @Override
    public List<User> findAllUsers() {
        List<User> users = null;
        users = userRepository.findAll().stream().sorted(Comparator.comparingInt(User::getScore)).collect(Collectors.toList());
        System.out.println(users);
        return users;
    }

    @Override
    public User findUserById(String id) throws UserNotFoundException{
        Optional<User> optional = userRepository.findById(id);
        if(!optional.isPresent()) throw new UserNotFoundException("User data not Found");
        return optional.get();
    }

    @Override
    public User updateUserById(UpdateUserRequestDto userDto, String userId) {
        int score = userDto.getScore();
        Optional<User> optional = userRepository.findById(userId);
        if(!optional.isPresent()) throw new UserNotFoundException("User data not Found");
        User user = optional.get();
        User updatedUser = new User(user.getId(), user.getUserName(), score);
        return userRepository.save((updatedUser));
    }

    @Override
    public User createUser(UserRequestDto userDto) {
        User user = null;
        try{
             user = userRepository.save(new User(userDto.getUserName()));
        }catch(Exception exception){
            return null;
        }
        return user;
    }

    @Override
    public String deleteUserById (String id) {
            Optional<User> optional = userRepository.findById(id);
            if(!optional.isPresent()) throw new UserNotFoundException("User data not Found");
            userRepository.delete(optional.get());
            return "User deleted Successfully";
    }
}
