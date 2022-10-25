package com.example.kafkaproducer.producer.producer;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static com.example.kafkaproducer.producer.config.KafkaTopicConfig.TOPIC_TOPIC1;

@Service
public class KafkaProducer {

    Log log = LogFactory.getLog(KafkaProducer.class);

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        log.info(String.format("$$ -> Producing message --> %s", message));
        kafkaTemplate.send(TOPIC_TOPIC1, message);
    }

}
