package edu.azati.customerservice.service;

import com.azati.sdk.model.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final static String TOPIC_NAME = "order_topic";

    @KafkaListener(
            topics = TOPIC_NAME,
            groupId = "customer_consumer",
            containerFactory = "bookListener")
    public void listen(Order order) {
        System.out.println("Received order: " + order);
    }
}
