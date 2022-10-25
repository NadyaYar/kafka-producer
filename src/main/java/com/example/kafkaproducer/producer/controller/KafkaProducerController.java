package com.example.kafkaproducer.producer.controller;
import com.example.kafkaproducer.producer.producer.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka/producer")
public class KafkaProducerController {

    private final KafkaProducer kafkaProducer;

    public KafkaProducerController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping("/publish")
    public String sendMessageToKafkaTopic(@RequestParam String message) {
        this.kafkaProducer.sendMessage(message);
        return "Message sent to kafka topic ";
    }
}
