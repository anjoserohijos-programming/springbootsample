package com.example.messages;

import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository {
    
    public Message save(Message message);
}
