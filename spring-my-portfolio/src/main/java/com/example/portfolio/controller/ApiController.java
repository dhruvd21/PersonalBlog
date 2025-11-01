package com.example.portfolio.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.portfolio.model.Message;
import com.example.portfolio.service.ApiService;

@RestController
public class ApiController {
    @Autowired
    private ApiService service;

    @PostMapping("/message")
    public ResponseEntity<Optional<Message>> addMessage(Message msg){
        Optional<Message> added = service.addMessage(msg);
        if(added.isEmpty()){
            return ResponseEntity.status(404).build();
        }
        return ResponseEntity.status(200).body(added);
    }
}
