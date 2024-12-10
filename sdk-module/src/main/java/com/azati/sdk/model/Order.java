package com.azati.sdk.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private String orderId;
    private String customerId;
    private int quantity;

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}