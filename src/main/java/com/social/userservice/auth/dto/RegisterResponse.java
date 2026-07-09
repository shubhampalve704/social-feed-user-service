package com.social.userservice.auth.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class RegisterResponse {

    private UUID id;
    private String username;
    private String email;
}