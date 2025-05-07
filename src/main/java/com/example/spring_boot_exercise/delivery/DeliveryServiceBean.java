package com.example.spring_boot_exercise.delivery;

import org.springframework.stereotype.Component;

@Component
public class DeliveryServiceBean {
    public void deliver() {
        System.out.println("deliver");
    }
}
