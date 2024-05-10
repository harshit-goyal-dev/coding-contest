package com.harshit.codingcontest.services;

import com.harshit.codingcontest.dto.UpdateUserRequestDto;
import com.harshit.codingcontest.dto.UserRequestDto;
import com.harshit.codingcontest.entity.User;
import com.harshit.codingcontest.exceptions.UserNotFoundException;
import com.harshit.codingcontest.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService{

    @Autowired
    private IUserRepository userRepository;

    @Override
    public List<User> findAllUsers() {
        List<User> users = null;
        try{
            users = userRepository.findAll().stream().sorted()
        }catch(Exception exception){

        }
        return null;
    }

    @Override
    public User findUserById(String id) throws UserNotFoundException{
        Optional<User> optional = userRepository.findById(id);
        if(!optional.isPresent()) throw new UserNotFoundException("User data not Found");
        return optional.get();
    }

    @Override
    public User updateUserById(UpdateUserRequestDto userDto) {
        String userId = userDto.getId();
        int score = userDto.getScore();

        return null;
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
    public String deleteUserById(String id) {
        try{

        }catch(Exception exception){

        }
        return null;
    }
}
