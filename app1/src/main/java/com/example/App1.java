package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class App1 {
    public static void main(String[] args) {
        SpringApplication.run(App1.class, args);
    }

    @RestController
    public static class Controller {
        @GetMapping("/thing")
        public Thing getThing() {
            return new Thing("1", "hello from app 1");
        }
    }
}
