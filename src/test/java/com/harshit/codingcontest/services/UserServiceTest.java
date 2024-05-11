package com.harshit.codingcontest.services;

import com.harshit.codingcontest.repositories.IUserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @Autowired
    private UserService userService;

    @MockBean
    private IUserRepository userRepository;

    @Test
    public void getAllUsers(){
        //when(userRepository.findAll()).thenReturn()
    }

}
