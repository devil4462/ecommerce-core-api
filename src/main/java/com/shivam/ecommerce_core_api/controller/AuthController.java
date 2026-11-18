package com.shivam.ecommerce_core_api.controller;

import com.shivam.ecommerce_core_api.dto.ApiResponse;
import com.shivam.ecommerce_core_api.dto.AuthResponse;
import com.shivam.ecommerce_core_api.dto.LoginRequest;
import com.shivam.ecommerce_core_api.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<ApiResponse<AuthResponse>> login(@Valid @RequestBody LoginRequest request) {
        AuthResponse authResponse = authService.login(request);
        return ResponseEntity.ok(ApiResponse.success("Login successful", authResponse));
    }

}
