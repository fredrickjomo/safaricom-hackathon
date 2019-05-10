package com.safaricomhackathon.microservices.controller;


import com.safaricomhackathon.microservices.exception.UserNotFoundException;
import com.safaricomhackathon.microservices.model.UserModel;
import com.safaricomhackathon.microservices.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/movie-api",produces = "application/json")
public class UserController {
    @Autowired
    UserRepository userRepository;


    //Register User
    @PostMapping("/register")
    public UserModel registerUser(@Valid @RequestBody UserModel userModel){
        return userRepository.save(userModel);

    }

    //get all users
    @RequestMapping("/all-users")
    public List< UserModel> getAllUsers(){
        return userRepository.findAll();
    }
    //delete user
    @RequestMapping("/delete-user/{id}")
    public ResponseEntity<?>deleteMovie(@PathVariable("id")long id){
        UserModel userModel=userRepository.findById(id).orElseThrow(()->new UserNotFoundException("Movie","id",id));
        userRepository.delete(userModel);
        return ResponseEntity.ok().build();

    }


}
