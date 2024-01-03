package org.example.movieapp.services;

import org.example.movieapp.entite.User;
import org.example.movieapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User signUp(User user) {
        // Implement your signup logic (e.g., password hashing)
        return userRepository.save(user);
    }

    public Optional<User> signIn(String email, String password) {
        // Implement your signin logic
        return userRepository.findByEmail(email)
                .filter(user -> user.getPassword().equals(password));
    }
}
