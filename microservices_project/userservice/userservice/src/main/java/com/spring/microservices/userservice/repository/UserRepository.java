package com.spring.microservices.userservice.repository;

import com.spring.microservices.userservice.entities.User;
import com.spring.microservices.userservice.exceptionHandling.ResourceNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//public interface UserRepository extends JpaRepository<User,String> {
public interface UserRepository  {

    User save(User user);

    User findById(String userId) throws ResourceNotFoundException;

    List<User> findAll();

    User deleteById(String userId);


}
