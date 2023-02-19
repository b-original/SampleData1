package com.spring.microservices.userservice.payload;

import lombok.*;
import org.springframework.http.HttpStatus;


@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor

public class ApiResponse {

    private String message;
    private HttpStatus httpStatus;
}
