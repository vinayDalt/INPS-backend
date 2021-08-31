package com.example.iNPSAdhoc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "Country does not exists on server")
public class CountryNotFound extends Exception {

    private String message;

    public CountryNotFound()
    {}

    public CountryNotFound(String message){

        super(message);
        this.message=message;

    }
}
