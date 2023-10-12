package com.molina.todolist.user;

import lombok.Data;

@Data
public class UserModel {

    private String name;
    private String userName;
    private String password;

    public UserModel() {
    }

    public UserModel(String name, String userName, String password) {
        this.name = name;
        this.userName = userName;
        this.password = password;
    }

}
