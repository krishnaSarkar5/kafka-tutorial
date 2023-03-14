package com.kafkatutorial.kafka;


import com.kafkatutorial.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaJsonConsumer {


    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaJsonConsumer.class);


    @KafkaListener(topics = "new_user_topic" , groupId = "myGroup")
    public void receiveJsonMessage(User user){
        LOGGER.info("message received message   "+user.toString());
    }
}
