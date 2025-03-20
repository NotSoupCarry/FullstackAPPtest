package com.example.backend.controllers;
import org.springframework.web.bind.annotation.*;

import com.example.backend.models.Utente;
import com.example.backend.repositories.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<Utente> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public Utente createUser(@RequestBody Utente user) {
        return userRepository.save(user);
    }
}
