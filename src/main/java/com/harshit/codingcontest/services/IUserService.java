package com.harshit.codingcontest.services;

import com.harshit.codingcontest.dto.UpdateUserRequestDto;
import com.harshit.codingcontest.dto.UserRequestDto;
import com.harshit.codingcontest.entity.User;

import java.util.List;

public interface IUserService {
    public List<User> findAllUsers();

    public  User findUserById(String id);

    public User updateUserById(UpdateUserRequestDto userDto, String userId);

    public User createUser(UserRequestDto userDto);

    public String deleteUserById(String id);
}
