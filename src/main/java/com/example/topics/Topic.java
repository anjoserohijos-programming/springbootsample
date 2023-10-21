package com.example.topics;

public class Topic {
    private int topicId;
    private String topicName;
    private String topicDescription;
    
    public Topic( int topicId, String topicName) {
        this.topicId = topicId;
        this.topicName = topicName;
    }
    public Topic(int topicId, String topicName, String topicDescription) {
        this.topicId = topicId;
        this.topicName = topicName;
        this.topicDescription = topicDescription;
    }

    public void setTopicDescription(String topicDescription) {
        this.topicDescription = topicDescription;
    }
    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }
    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }
    public String getTopicDescription() {
        return topicDescription;
    }
    public int getTopicId() {
        return topicId;
    }
    public String getTopicName() {
        return topicName;
    }
}
