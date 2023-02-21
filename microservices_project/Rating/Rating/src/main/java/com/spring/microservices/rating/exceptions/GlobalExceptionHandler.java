package com.spring.microservices.rating.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NoDataFoundException.class)
    public ResponseEntity<Map<String,Object>> handleNoDataFoundException(NoDataFoundException ex){
        Map<String,Object> map= new HashMap<>();
        map.put("Message",ex.getMessage());
        map.put("status", HttpStatus.NOT_FOUND);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
    }

    @ExceptionHandler(UnableToFetchException.class)
    public ResponseEntity<Map<String,Object>> handleUnableToFetchException(UnableToFetchException ex){
        Map <String,Object> map= new HashMap<>();
        map.put("message",ex.getMessage());
        map.put("Status",HttpStatus.NOT_FOUND);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);

    }

    @ExceptionHandler(ErrorWhileSavingException.class)
    public ResponseEntity<Map<String,Object>> handleErrorWhileSaving(ErrorWhileSavingException ex){
        Map <String,Object> map= new HashMap<>();
        map.put("message",ex.getMessage());
        map.put("Status",HttpStatus.NOT_ACCEPTABLE);
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(map);

    }

}
