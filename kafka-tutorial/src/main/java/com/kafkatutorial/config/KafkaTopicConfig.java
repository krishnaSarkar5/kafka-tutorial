package com.kafkatutorial.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {


    @Bean
    public NewTopic createNewTopic(){
        return TopicBuilder.name("new_example_topic") // name of the topic
//                .partitions(10) // no of partition declare at the creation time if not provided it will set a default value
                .build();
    }
}
