package com.kafkatutorial.controller;


import com.kafkatutorial.kafka.KafkaJsonProducer;
import com.kafkatutorial.payload.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {


    @Autowired
    private KafkaJsonProducer kafkaJsonProducer;

    @PostMapping("/publish")
    public ResponseEntity<String> sendJsonMessage(@RequestBody User user){
        kafkaJsonProducer.sendJsonMessage(user);
        return new ResponseEntity<String>("Json Message sent. ", HttpStatus.OK);
    }
}
