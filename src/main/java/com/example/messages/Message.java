package com.example.messages;

public class Message {
    private int messageId;
    private String message;
    private String messageType;

    //constructor
    public Message(int messageId, String message, String messageType) {
        this.messageId = messageId;
        this.message = message;
        this.messageType = messageType;
    }
    public Message() {
        
    }
    //getters and setters
    public int getMessageId() {
        return messageId;
    }
    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessageType() {
        return messageType;
    }
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
    
}
