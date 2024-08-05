package com.example.chatapp.model;

import com.example.chatapp.model.enums.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    private String nickName;
    private String fullName;
    private Status status;
}
