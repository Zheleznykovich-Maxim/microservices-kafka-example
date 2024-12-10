package edu.azati.orderservice.controller;

import com.azati.sdk.model.Order;
import edu.azati.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/send")
    public String sendMessage(@RequestBody Order order) {
        orderService.send(order);

        return "Published successfully";
    }
}
