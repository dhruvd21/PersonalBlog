package com.example.portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Message {
    @Id
    @GeneratedValue
    private int messageId;
    private String sendersName;
    private String messageDescription;
    public Message(){

    }
    public int getMessageId() {
        return messageId;
    }
    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }
    public String getSendersName() {
        return sendersName;
    }
    public void setSendersName(String sendersName) {
        this.sendersName = sendersName;
    }
    public String getMessageDescription() {
        return messageDescription;
    }
    public void setMessageDescription(String messageDescription) {
        this.messageDescription = messageDescription;
    }
    
}
