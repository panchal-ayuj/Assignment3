package com.example.assignment3.controller;

import com.example.assignment3.User;
import com.example.assignment3.exceptions.UserAlreadyEnrolledException;
import com.example.assignment3.exceptions.UserNotFoundException;
import com.example.assignment3.service.UserService;
import com.example.assignment3.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestParam int user_id, @RequestParam String user_name, @RequestParam String address, @RequestParam Double latitude, @RequestParam Double longitude) {
        try {
            User user = userService.registerUser(user_id, user_name, address, latitude, longitude);
            return ResponseEntity.ok(user);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/enroll")
    public ResponseEntity<String> enrollForOfflinePayment(@RequestParam int user_id) {
        try {
            userService.enrollForOfflinePayment(user_id);
            return ResponseEntity.ok("Enrolled for offline payment successfully.");
        } catch (UserNotFoundException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        } catch (UserAlreadyEnrolledException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User is already enrolled.");
        }
    }
}
