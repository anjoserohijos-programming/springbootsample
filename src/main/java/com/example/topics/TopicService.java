package com.example.topics;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

    public Topic getTopic(int topicId) {
        return new Topic(topicId, "Topic " + topicId);
    }

    public List<Topic> getTopics() {
        return null;
    }

    
}
