package com.rimonmostafiz.core.services;

import com.rimonmostafiz.core.models.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Rimon Mostafiz
 */
@Service
public class TopicService {

    private List<Topic> topicList = new ArrayList<>( Arrays.asList(
            new Topic("spring", "spring-boot", "spring boot project"),
            new Topic("java", "core-java", "core java project"),
            new Topic("javascript", "javascript-angularjs", "javascript angular project")
        ));

    public List<Topic> getTopicList() {
        return topicList;
    }

    public Topic getTopic(String id) {
        /*for (Topic topic : topicList) {
            if (topic.getId().equals(id)) {
                return topic;
            }
        }
        return null;*/

        return topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topicList.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for (int i = 0; i < topicList.size(); i++) {
            Topic t = topicList.get(i);
            if (t.getId().equals(id)) {
                 topicList.set(i, topic);
                 return;
            }
        }
    }

    public void deleteTopic(String id) {
        topicList.removeIf(t -> t.getId().equals(id));
    }
}
