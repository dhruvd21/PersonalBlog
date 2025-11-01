package com.example.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.portfolio.model.Message;

public interface MessageRepo extends JpaRepository<Message, Integer>{
    
}
