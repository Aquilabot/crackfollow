package com.crackfollow.crackfollow.controller;

import com.crackfollow.crackfollow.model.User;
import com.crackfollow.crackfollow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/all")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
