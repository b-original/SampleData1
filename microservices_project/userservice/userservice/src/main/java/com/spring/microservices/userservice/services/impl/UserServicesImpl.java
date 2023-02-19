package com.spring.microservices.userservice.services.impl;

import com.spring.microservices.userservice.entities.User;
import com.spring.microservices.userservice.exceptionHandling.ResourceNotFoundException;
import com.spring.microservices.userservice.repository.UserRepository;
import com.spring.microservices.userservice.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        System.out.println("In service class Save call: ");
        String randomUserId =UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return userRepository.save(user);
    }

    @Override
    public User getUser(String userId) throws ResourceNotFoundException{
        System.out.println("In service getUser call: "+userId);
        return userRepository.findById(userId);
    }

    @Override
    public List<User> getAllUser() {
        System.out.println("In service class getAllUsercall: ");
        return userRepository.findAll();
    }

    @Override
    public User deleteUser(String userId) {
        System.out.println("user id to be deleted: "+userId);
        return userRepository.deleteById(userId);
    }
}
