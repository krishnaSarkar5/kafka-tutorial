package com.kafkaProducer.kafkaProducer.controller;

import com.kafkaProducer.kafkaProducer.Producer.KafkaProducer;
import com.kafkaProducer.kafkaProducer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping("/publish")
    public ResponseEntity<String> sendMessage(@RequestBody User user){
        kafkaProducer.sendMessage(user);
        return new ResponseEntity<>("Message sent successfully", HttpStatus.OK);
    }
}
