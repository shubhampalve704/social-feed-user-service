package com.social.userservice.auth.service;

import com.social.userservice.auth.dto.RegisterRequest;
import com.social.userservice.auth.dto.RegisterResponse;

public interface AuthService {
    RegisterResponse register(RegisterRequest request);

}
