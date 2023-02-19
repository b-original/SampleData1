package com.spring.microservices.userservice.repository.impl;

import com.spring.microservices.userservice.entities.User;
import com.spring.microservices.userservice.exceptionHandling.ResourceNotFoundException;
import com.spring.microservices.userservice.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private static Map<String,User> sampleDatabase= new HashMap<>();

    @Override
    public User save(User user) {
        String id=user.getUserId();
        sampleDatabase.put(id,user);
        return sampleDatabase.get(id);
    }

    @Override
    public User findById(String userId) throws ResourceNotFoundException {
        System.out.println("user id to find: "+userId);
        return sampleDatabase.get(userId);
    }

    @Override
    public List<User> findAll() {
        List<User> users= sampleDatabase.values().stream().collect(Collectors.toList());
        return users;
    }

    @Override
    public User deleteById(String userId) {
        return sampleDatabase.remove(userId);
    }
}
