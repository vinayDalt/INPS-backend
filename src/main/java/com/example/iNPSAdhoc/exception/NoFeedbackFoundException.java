package com.example.iNPSAdhoc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "Feedback not found on server")
public class NoFeedbackFoundException extends Exception {

    private String message;

    public NoFeedbackFoundException(){}

    public NoFeedbackFoundException(String message){
        super(message);
        this.message=message;
    }
}
