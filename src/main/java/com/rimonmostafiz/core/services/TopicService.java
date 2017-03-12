package com.rimonmostafiz.core.services;

import com.rimonmostafiz.core.models.Topic;
import com.rimonmostafiz.core.repositories.TopicRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Rimon Mostafiz
 */
@Service
public class TopicService {

    @Autowired
    private TopicRepositories topicRepositories;

    public List<Topic> getTopicList() {
        List<Topic> topicList = new ArrayList<>();
        topicRepositories.findAll().forEach(topicList::add);
        return topicList;
    }

    public Topic getTopic(String id) {
        return topicRepositories.findOne(id);
    }

    public void addTopic(Topic topic) {
        topicRepositories.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        topicRepositories.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepositories.delete(id);
    }
}
