package com.harshit.codingcontest.controllers;

import com.harshit.codingcontest.dto.UpdateUserRequestDto;
import com.harshit.codingcontest.dto.UserRequestDto;
import com.harshit.codingcontest.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
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
        return ResponseEntity.ok(users);
    }
    @GetMapping(USER_ENDPOINT+"/{id}")
    public ResponseEntity<User> getUserById(@PathVariable String id){

        User user = null;
        try{

        }catch(Exception exception){

        }
        return ResponseEntity.ok(user);
    }
    @PostMapping(USER_ENDPOINT)
    public ResponseEntity<User> registerUser(@RequestBody UserRequestDto user){

    }
    @PutMapping(USER_ENDPOINT+"/{id}")
    public ResponseEntity<User> updateUser(@RequestBody UpdateUserRequestDto userDto){

    }

    @DeleteMapping(USER_ENDPOINT+"/{id}")
    public ResponseEntity<String> removeUser(@PathVariable String id){

    }
}
