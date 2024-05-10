package com.harshit.codingcontest.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
//import javax.validation.constraints.NotEmpty;

import java.util.ArrayList;
import java.util.List;

@Data
@Document
public class User {
    @Id
    private String id;

   // @NotEmpty
    private String userName;

    private int score;
    private List<Badge> badges;

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
}
