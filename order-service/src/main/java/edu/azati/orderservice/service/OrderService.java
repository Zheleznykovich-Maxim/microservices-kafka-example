package edu.azati.orderservice.service;

import com.azati.sdk.model.Order;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final KafkaTemplate<String, Order> kafkaTemplate;
    private final NewTopic topic;

    public void send(Order order) {
        kafkaTemplate.send(topic.name(), order);
    }
}
