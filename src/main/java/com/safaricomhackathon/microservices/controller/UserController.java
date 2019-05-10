package com.safaricomhackathon.microservices.controller;


import com.safaricomhackathon.microservices.model.UserModel;
import com.safaricomhackathon.microservices.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/movie-api")
public class UserController {
    @Autowired
    UserRepository userRepository;


    //Register User
    @PostMapping("/register")
    public UserModel registerUser(@Valid @RequestBody UserModel userModel){
        return userRepository.save(userModel);
    }

}
