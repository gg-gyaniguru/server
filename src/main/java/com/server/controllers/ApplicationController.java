package com.server.controllers;

import com.server.http.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ApplicationController {

    @GetMapping("")
    public ResponseEntity<Response> api() {
        return new ResponseEntity<>(new Response("server is running"), HttpStatus.OK);
    }
}