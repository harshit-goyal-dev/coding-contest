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
    private final String userName;

    private int score;
    private List<Badge> badges;

    public User(String userName) {
        this.userName = userName;
        this.score = 0;
        this.badges = new ArrayList<Badge>();
    }

    public User(){

    }
}
