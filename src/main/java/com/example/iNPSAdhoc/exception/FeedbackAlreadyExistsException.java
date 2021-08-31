package com.example.iNPSAdhoc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "Feedback already exists on server")
public class FeedbackAlreadyExistsException extends Exception {

    private String message;

public FeedbackAlreadyExistsException()
{}

public FeedbackAlreadyExistsException(String message){

    super(message);
    this.message=message;

}
}
