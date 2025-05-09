package com.example.springSecurity.dto;


import lombok.Data;

@Data
public class LoginDto {
    private String usernameOrEmail;
    private String password;
}
