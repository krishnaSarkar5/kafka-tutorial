package com.kafkatutorial.kafka;

import com.kafkatutorial.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaJsonProducer {


    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaJsonProducer.class);


    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    public void sendJsonMessage(User user){

        LOGGER.info("Json message sending "+user.toString());


        Message<User> message = MessageBuilder
                .withPayload(user)
                .setHeader(KafkaHeaders.TOPIC,"new_user_topic")
                .build();

        kafkaTemplate.send(message);

    }

}
