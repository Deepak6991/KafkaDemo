package com.example.KafkaLearn.KafkaConsumerExample.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "kafka_consume" , groupId = "group_id")
    public void consumer(String message)
    {
        System.out.println("Consumed message " +message);
    }
}
