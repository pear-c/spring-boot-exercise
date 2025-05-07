package com.example.spring_boot_exercise.order;

import org.springframework.stereotype.Component;

@Component
public class OrderReceiverBean {
    public void receiveOrder() {
        System.out.println("receiveOrder");
    }
}
