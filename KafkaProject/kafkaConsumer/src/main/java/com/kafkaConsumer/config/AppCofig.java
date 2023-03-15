package com.kafkaConsumer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.stereotype.Component;

@Configuration
public class AppCofig {

    @Bean
    public NewTopic createNewTopic(){
        return TopicBuilder
                .name("example2")
                .build();
    }
}
