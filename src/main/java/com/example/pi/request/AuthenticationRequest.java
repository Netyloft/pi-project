package com.example.pi.request;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String login;
    private String password;
}
