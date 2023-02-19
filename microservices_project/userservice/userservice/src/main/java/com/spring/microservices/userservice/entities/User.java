package com.spring.microservices.userservice.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
//@Table(name="users")
public class User {

   // @Id
    //@Column(name="userId")
    private String userId;

    //@Column(name="name")
    private String name;

    //@Column(name="email")
    private String email;

}
