package com.social.userservice.service;

import com.social.userservice.dto.auth.RegisterRequest;
import com.social.userservice.dto.auth.RegisterResponse;

public interface AuthService {
    RegisterResponse register(RegisterRequest request);

}
