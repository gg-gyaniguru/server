package com.server.entities;

public class InternalServerException extends RuntimeException {

    public InternalServerException(String message) {
        super(message);
    }
}