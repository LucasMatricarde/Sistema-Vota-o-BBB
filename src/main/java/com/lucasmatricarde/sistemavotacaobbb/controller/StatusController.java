package com.lucasmatricarde.sistemavotacaobbb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    @GetMapping("/status")
    public ResponseEntity<String> status() {
        return new ResponseEntity<>("Sistema Votação BBB - 1", HttpStatus.OK);
    }
}
