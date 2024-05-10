package com.harshit.codingcontest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UpdateUserRequestDto {

    private String id;
    private int score;


}
