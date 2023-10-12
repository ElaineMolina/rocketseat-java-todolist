package com.molina.todolist.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalTime;
import java.util.UUID;

@Data
@Entity(name = "tb_users")
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)
    private String name;
    private String userName;
    private String password;

    @CreationTimestamp
    private LocalTime createdAt;

    public UserModel() {
    }

    public UserModel(String name, String userName, String password) {
        this.name = name;
        this.userName = userName;
        this.password = password;
    }

}
