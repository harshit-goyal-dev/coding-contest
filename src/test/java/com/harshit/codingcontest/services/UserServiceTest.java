package com.harshit.codingcontest.services;

import com.harshit.codingcontest.repositories.UserRepository;
import com.harshit.codingcontest.repositoryService.UserRepositoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.when;

//@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @MockBean
    private UserRepositoryService userRepositoryService;

    @Test
    public void getAllUsers(){
        //when(userRepositoryService.findAll()).thenReturn()
    }

}
