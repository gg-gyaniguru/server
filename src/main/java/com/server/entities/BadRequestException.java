package com.server.entities;

public class BadRequestException extends RuntimeException {

    public BadRequestException(String message) {
        super(message);
    }
}