package com.shivam.ecommerce_core_api.dto;

import com.shivam.ecommerce_core_api.entity.Role;

import java.time.LocalDateTime;

public record UserResponse(
        Long id,
        String fullName,
        String email,
        Role role,
        LocalDateTime createdAt
) {


}
