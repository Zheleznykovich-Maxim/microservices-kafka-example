package edu.azati.inventoryservice.service;

import com.azati.sdk.model.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    private final static String TOPIC_NAME = "order_topic";

    @KafkaListener(
            topics = TOPIC_NAME,
            groupId = "inventory_consumer",
            containerFactory = "bookListener")
    public void listen(Order order) {
        System.out.println("Received order: " + order.toString());
    }
}
