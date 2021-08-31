package com.example.iNPSAdhoc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "Country already exists on server")
public class CountryAlreadyExists extends Exception {
    private String message;

    public CountryAlreadyExists()
    {}

    public CountryAlreadyExists(String message){

        super(message);
        this.message=message;

    }
}
