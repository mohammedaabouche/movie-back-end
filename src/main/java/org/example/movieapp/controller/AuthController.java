package org.example.movieapp.controller;

import org.example.movieapp.entite.User;
import org.example.movieapp.services.FavorsServices;
import org.example.movieapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class AuthController {

    private UserService userService;
    @Autowired
    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public ResponseEntity<User> signUp(@RequestBody User user) {
        User newUser = userService.signUp(user);
        System.out.println(newUser.getFullName());
        return ResponseEntity.ok(newUser);
    }

    @PostMapping("/signin")
    public ResponseEntity<String> signIn(@RequestBody User user) {

        Optional<User> newUser = userService.signIn(user.getEmail(), user.getPassword());
        return newUser.map(value -> ResponseEntity.ok("Login successful"))
                .orElseGet(() -> ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed"));
    }
}
