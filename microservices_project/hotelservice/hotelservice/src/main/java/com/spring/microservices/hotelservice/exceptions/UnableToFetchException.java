package com.spring.microservices.hotelservice.exceptions;

public class UnableToFetchException extends RuntimeException{

    public UnableToFetchException(){
        super("Unable to fetch record!!");
    }

    public UnableToFetchException(String message){
        super(message);
    }
}
