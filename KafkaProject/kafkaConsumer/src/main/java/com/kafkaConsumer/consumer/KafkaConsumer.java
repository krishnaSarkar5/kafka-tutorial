package com.kafkaConsumer.consumer;

import com.kafkaConsumer.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);


    @KafkaListener(topics = "example2" , groupId = "myGroup")
    public void receiveJsonMessage(String  user) {
        LOGGER.info("message received message   " + user);
    }

}
