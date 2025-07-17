package com.example.auth_service.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Entity
public class User {
    @Id @GeneratedValue
    private Long id;
    private String username;
    private String password;
}
