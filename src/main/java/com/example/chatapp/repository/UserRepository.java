package com.example.chatapp.repository;

import com.example.chatapp.model.User;
import com.example.chatapp.model.enums.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {
    List<User> findAllByStatus(Status status);
}
