package com.springy.subscription_platform.controller;

import com.springy.subscription_platform.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<Map<String, Object>> getUsers() {
        return List.of(
                Map.of(
                        "id", 1,
                        "name", "Alice",
                        "email", "alice@example.com"
                ),
                Map.of(
                        "id", 2,
                        "name", "Bob",
                        "email", "bob@example.com"
                )
        );
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return user;
    }
}
