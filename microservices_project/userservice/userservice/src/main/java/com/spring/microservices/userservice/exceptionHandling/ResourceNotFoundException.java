package com.spring.microservices.userservice.exceptionHandling;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(){
        super("Resource not Found on Server!!!");
    }

    public ResourceNotFoundException(String message){
        super(message);
    }

}
