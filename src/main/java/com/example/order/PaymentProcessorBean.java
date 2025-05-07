package com.example.order;

import org.springframework.stereotype.Component;

@Component
public class PaymentProcessorBean {
    public void processPayment() {
        System.out.println("processPayment");
    }
}
