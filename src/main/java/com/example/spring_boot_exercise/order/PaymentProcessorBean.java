package com.example.spring_boot_exercise.order;

import org.springframework.stereotype.Component;

@Component
public class PaymentProcessorBean {
    public void processPayment() {
        System.out.println("processPayment");
    }
}
