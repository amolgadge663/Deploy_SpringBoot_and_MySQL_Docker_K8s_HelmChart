package com.amolsoftwares.usermanagement.controller;

import com.amolsoftwares.usermanagement.entity.User;
import com.amolsoftwares.usermanagement.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/")
    private ResponseEntity<User> createUser(@RequestBody User user) {
        User userCreate = userService.createUser(user);

        return ResponseEntity.status(HttpStatus.CREATED).body(userCreate);

    }

    @GetMapping("/")
    private ResponseEntity<List<User>> getAllUsers() {

        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    private ResponseEntity<User> getUserById(@PathVariable String id) {
        User userById = userService.getUserById(id);
        return ResponseEntity.status(HttpStatus.OK).body(userById);
    }
}
