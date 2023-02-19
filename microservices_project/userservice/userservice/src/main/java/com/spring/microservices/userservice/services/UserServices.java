package com.spring.microservices.userservice.services;

import com.spring.microservices.userservice.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserServices {


    User saveUser(User user);

    User getUser(String userId);

    List<User> getAllUser();

    User deleteUser(String Id);
}
