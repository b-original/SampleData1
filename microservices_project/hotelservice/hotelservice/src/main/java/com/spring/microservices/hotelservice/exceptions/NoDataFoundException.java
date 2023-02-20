package com.spring.microservices.hotelservice.exceptions;


public class NoDataFoundException extends RuntimeException {

    public NoDataFoundException(){
        super("No Data found in DataBase!!!");
    }

    public NoDataFoundException(String str){
        super(str);
    }
}
