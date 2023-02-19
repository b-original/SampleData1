package com.spring.microservices.userservice.controller;


import com.spring.microservices.userservice.entities.User;
import com.spring.microservices.userservice.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServices userServices;

    //create
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User returnedUser= userServices.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(returnedUser);
    }

    //get single User
    @GetMapping("/getuser/{userId}")
    public ResponseEntity<User> getSingleUser(@PathVariable String userId){
        User returnedUser= userServices.getUser(userId);
        return ResponseEntity.ok(returnedUser);
    }
    //get All users
    @GetMapping("/getAllusers")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users=userServices.getAllUser();
        return ResponseEntity.ok(users);
    }

    //delete one User
    @DeleteMapping("/deleteuser/{userId}")
    public ResponseEntity<User> deleteUser(@PathVariable String userId){
        User user1=userServices.deleteUser(userId);
        return ResponseEntity.ok(user1);
    }
}
