package com.example.demo;

import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Sera utile pour distinguer stable et canary plus tard
    @Value("${APP_VERSION:v1}")
    private String version;

    @GetMapping("/")
    public Map<String, String> hello() {
        return Map.of(
                "message", "Hello from CD pipeline",
                "version", version);
    }
}