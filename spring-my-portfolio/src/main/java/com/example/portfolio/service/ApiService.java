package com.example.portfolio.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.portfolio.model.Message;
import com.example.portfolio.repository.MessageRepo;

@Service
public class ApiService {
    @Autowired
    private MessageRepo mRepo;

    public Optional<Message> addMessage(Message msg){
        if(msg == null){
            return Optional.empty();
        }
        return Optional.of(mRepo.save(msg));
    }
    
}
