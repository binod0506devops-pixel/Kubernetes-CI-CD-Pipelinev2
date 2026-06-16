package com.nuvora.devopsv2.Kubernetes.CI.CD.Pipelinev2.controller;

import com.nuvora.devopsv2.Kubernetes.CI.CD.Pipelinev2.entity.User;
import org.springframework.web.bind.annotation.*;
import com.nuvora.devopsv2.Kubernetes.CI.CD.Pipelinev2.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}