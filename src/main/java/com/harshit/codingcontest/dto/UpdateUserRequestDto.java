package com.harshit.codingcontest.dto;

public class UpdateUserRequestDto {

    private int score;

    public UpdateUserRequestDto() {
    }

    public UpdateUserRequestDto(int score) {
        this.score = score;
    }

    public int getScore(){
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
