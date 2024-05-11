package com.harshit.codingcontest.entity;

import jakarta.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
public class User {
    @Id
    private String id;

    @NotEmpty
    private String userName;

    private int score;
    private List<Badge> badges;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
        this.score = 0;
        this.badges = new ArrayList<Badge>();
    }

    public User(String id, String userName, int score) {
        this.id = id;
        this.userName = userName;
        this.score = score;
        addBadgeToBadgeList(score);
    }

    private void addBadgeToBadgeList(int score){
        this.badges = new ArrayList<>();

        if(score >0) badges.add(Badge.Code_Ninja);
        if(score>=30) badges.add(Badge.Code_Champ);
        if(score>=60) badges.add(Badge.Code_Master);
    }

    public String getUserName(){
        return this.userName;
    }

    public String getId(){
        return this.id;
    }

    public int getScore(){
        return this.score;
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
        this.badges = new ArrayList<>(badges);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", score=" + score +
                ", badges=" + badges +
                '}';
    }
}
