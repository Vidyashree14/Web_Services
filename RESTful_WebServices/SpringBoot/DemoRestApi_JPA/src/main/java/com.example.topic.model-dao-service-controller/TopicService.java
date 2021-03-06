/**
  * Created by Vidyashree on 05/31/2018.
  */
 
package com.example.topic.model-dao-service-controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

	
    @Autowired
    private TopicRepository topicRepository;

    // HTTP GET method call
    public List<Topic> getAllTopic(){

      List topics = new ArrayList();
      topicRepository.findAll().forEach(topics::add);     // Connect to DataBase + Run a query to get all topics + Convert each of those rows to topic instances and get them back

      return topics;

    }

    // HTTP GET method call
    public Optional<Topic> getTopic(String id) {

      return topicRepository.findById(id);				// Connect to DataBase + Run a query by making a call to the DataBase and returning a value

    }

    // HTTP POST method call
    public void addTopic(Topic topics) {

      topicRepository.save(topics);						// Connect to DataBase + Run a query to save a topic to the database

    }

    // HTTP PUT method call
    public void updateTopic(String id, Topic topics) {

      topicRepository.save(topics);						// Connect to DataBase + Run a query to update and save a topic for given id to the database

    }

    // HTTP DELETE method call
    public void deleteTopic(String id) {

      topicRepository.deleteById(id);						// Connect to DataBase + Run a query to delete given id from the database

    }

	
}
