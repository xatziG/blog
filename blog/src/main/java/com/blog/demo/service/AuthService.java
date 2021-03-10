package com.blog.demo.service;


import com.blog.demo.dto.JwtAuthenticationResponse;
import com.blog.demo.dto.LoginRequest;
import com.blog.demo.dto.RegisterRequest;
import org.springframework.security.core.userdetails.User;

import java.util.Optional;

public interface AuthService {

    void signup(RegisterRequest registerRequest);
    JwtAuthenticationResponse login (LoginRequest loginRequest);

    Optional<User> getCurrentUser();
}
