package com.example.Online.Bus.Ticket.Booking.Application.ControllerRestApi;


import com.example.Online.Bus.Ticket.Booking.Application.Entity.User;
import com.example.Online.Bus.Ticket.Booking.Application.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
public class LoginControllerApi {

    @Autowired
    private UserRepo userRepository;

    // Login Endpoint
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        Optional<User> user = userRepository.findByEmail(loginRequest.getEmail());

        if (user.isPresent() && user.get().getPassword().equals(loginRequest.getPassword())) {
            // In real applications, generate a JWT token here
            return ResponseEntity.ok("Login successful! Welcome " + user.get().getName());
        } else {
            return ResponseEntity.status(401).body("Invalid email or password");
        }
    }

    // Logout Endpoint
    @PostMapping("/logout")
    public ResponseEntity<?> logout() {
        // In token-based systems, you would invalidate the token here
        return ResponseEntity.ok("Logout successful!");
    }

    // Request body for login
    public static class LoginRequest {
        private String email;
        private String password;

        // Getters and Setters
        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}