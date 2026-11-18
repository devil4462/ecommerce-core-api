package com.shivam.ecommerce_core_api.controller;

import com.shivam.ecommerce_core_api.dto.ApiResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/health")
public class HealthController {

    @Value("${spring.profiles.active:default}")
    private String activeProfiles;

    @GetMapping
    public ResponseEntity<ApiResponse> checkHealth(){
        Map<String, String> status = Map.of("status", "UP", "profile", activeProfiles);
        return ResponseEntity.ok(ApiResponse.success("E-commerce core API is running", status));
    }
}
