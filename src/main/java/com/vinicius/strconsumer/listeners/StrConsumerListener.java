package com.vinicius.strconsumer.listeners;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class StrConsumerListener {

    @KafkaListener(groupId = "group-1", topics = "str-topic", containerFactory = "containerFactory")
    public void listener(String message) {
       log.info("Receive message {}", message );
    }
}
