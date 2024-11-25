package com.server.controllers;

import com.server.entities.BadRequestException;
import com.server.entities.NotFoundException;
import com.server.http.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(NoResourceFoundException.class)
    public ResponseEntity<Response> noResourceFoundException() {
        return new ResponseEntity<>(new Response("route not found"), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<Response> badRequestException(BadRequestException exception) {
        return new ResponseEntity<>(new Response(exception.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Response> notFoundException(NotFoundException exception) {
        return new ResponseEntity<>(new Response(exception.getMessage()), HttpStatus.NOT_FOUND);
    }
}