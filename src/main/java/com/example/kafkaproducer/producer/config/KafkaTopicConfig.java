package com.example.kafkaproducer.producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    public static final String TOPIC_TOPIC1 = "topic1";
    public static final String TOPIC_TOPIC2 = "topic2";

    @Bean
    public NewTopic topic1() {
        return TopicBuilder.name(TOPIC_TOPIC1)
                .build();
    }

    @Bean
    public NewTopic topic2() {
        return TopicBuilder.name(TOPIC_TOPIC2)
                .build();
    }
}
