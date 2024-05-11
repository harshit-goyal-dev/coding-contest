package com.harshit.codingcontest.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;


public class UserRequestDto {

    @NotEmpty
    @Size(min=3)
    private String userName;

    public UserRequestDto() {
    }

    public UserRequestDto(String userName) {
        this.userName = userName;
    }

    public String getUserName(){
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
