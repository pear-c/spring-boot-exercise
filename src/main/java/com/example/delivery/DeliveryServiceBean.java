package com.example.delivery;

import org.springframework.stereotype.Component;

@Component
public class DeliveryServiceBean {
    public void deliver() {
        System.out.println("deliver");
    }
}
