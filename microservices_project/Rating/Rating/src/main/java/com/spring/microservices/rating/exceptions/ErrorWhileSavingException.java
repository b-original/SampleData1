package com.spring.microservices.rating.exceptions;

public class ErrorWhileSavingException extends RuntimeException{

    public ErrorWhileSavingException(){
        super("Error while saving the values");
    }

    public ErrorWhileSavingException(String message){
        super(message);
    }
}