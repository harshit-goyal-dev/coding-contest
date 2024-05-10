package com.harshit.codingcontest.controllers;

import com.harshit.codingcontest.dto.UpdateUserRequestDto;
import com.harshit.codingcontest.dto.UserRequestDto;
import com.harshit.codingcontest.entity.User;
import com.harshit.codingcontest.exceptions.UserNotFoundException;
import com.harshit.codingcontest.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.boot.autoconfigure.security.SecurityProperties.*;

@RestController
public class UserController {
    protected static final String APPLICATION_ENDPOINT = "codingcontest/api/v1";
    private static final String USER_ENDPOINT = "/users";

    @Autowired
    private IUserService userService;

    @GetMapping(USER_ENDPOINT)
    public ResponseEntity<List<User>> getUsers(){
        List<User> users = null;
        try{
            users = userService.findAllUsers();
        }catch(Exception exception){
            return ResponseEntity.internalServerError().build();
        }
        return ResponseEntity.ok(users);
    }
    @GetMapping(USER_ENDPOINT+"/{id}")
    public ResponseEntity<User> getUserById(@PathVariable String id){
        User user = null;
        try{
            user = userService.findUserById(id);
        }catch(UserNotFoundException exception){
            return ResponseEntity.notFound().build();
        }catch(Exception exception){
            return ResponseEntity.internalServerError().build();
        }

//        try{
//
//        }catch(Exception exception){
//
//        }
        return ResponseEntity.ok(user);
    }
    @PostMapping(USER_ENDPOINT)
    public ResponseEntity<User> registerUser(@RequestBody UserRequestDto userRequestDto){
        User user = null;
        try{
            user = userService.createUser(userRequestDto);
        }catch(Exception exception){
            return ResponseEntity.internalServerError().build();
        }
        return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(user);
    }
    @PutMapping(USER_ENDPOINT+"/{id}")
    public ResponseEntity<User> updateUser(@RequestBody UpdateUserRequestDto userDto){
        User user = null;
        try{
            user = userService.updateUserById(userDto);
        }catch(UserNotFoundException exception){
            return ResponseEntity.notFound().build();
        }catch(Exception exception){
            return ResponseEntity.internalServerError().build();
        }
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(user);
    }

    @DeleteMapping(USER_ENDPOINT+"/{id}")
    public ResponseEntity<String> removeUser(@PathVariable String id){
        String response=null;
        try{
            response = userService.deleteUserById(id);
        }catch(UserNotFoundException exception){
            return ResponseEntity.notFound().build();
        }catch(Exception exception){
            return ResponseEntity.internalServerError().build();
        }
        return ResponseEntity.status(HttpStatusCode.valueOf(204)).body(response);
    }
}
