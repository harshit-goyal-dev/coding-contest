package com.harshit.codingcontest.dto;

import com.harshit.codingcontest.entity.Badge;
import com.harshit.codingcontest.entity.User;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;

import java.util.List;

public class UserResponseDto {

    private String id;

    private String userName;

    private int score;

    private List<Badge> badges;

    public UserResponseDto() {
    }
    public UserResponseDto(User user) {
        this.id = user.getId();
        this.userName = user.getUserName();
        this.score = user.getScore();
        this.badges = user.getBadges();
    }
    public UserResponseDto(String id, String userName, int score, List<Badge> badges) {
        this.id = id;
        this.userName = userName;
        this.score = score;
        this.badges = badges;
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public int getScore() {
        return score;
    }

    public List<Badge> getBadges() {
        return badges;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setBadges(List<Badge> badges) {
        this.badges = badges;
    }
}
