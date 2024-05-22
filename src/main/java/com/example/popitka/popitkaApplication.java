package com.example.popitka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class popitkaApplication {
    public static void main(String[] args) {
        SpringApplication.run(popitkaApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "ЖИИИЗНЬ!";
    }

}
