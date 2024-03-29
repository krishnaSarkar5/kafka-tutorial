package com.kafkaProducer.kafkaProducer.Producer;


import com.kafkaProducer.kafkaProducer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String ,String  > kafkaTemplate;


    public void sendMessage(User user){

//        Message<Object> message = MessageBuilder.withPayload(user).setHeader(KafkaHeaders.TOPIC,"demo").build();

        kafkaTemplate.send("example2",user.toString());

    }
}
