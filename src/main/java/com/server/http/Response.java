package com.server.http;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

    public String message;
    public Object data;

    public Response(String message) {
        this.message = message;
    }
    public Response(Object data) {
        this.data = data;
    }
}