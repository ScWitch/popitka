package com.example.popitka.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/health")
public class HealthCheckController {
    @GetMapping
    public ResponseEntity<String> healthCheck() {
        String message = "ГДЕ Я???";
        return ResponseEntity.ok(message);
    }

}
