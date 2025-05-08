package com.example.order;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentProcessorBean {
    @Value("${payment-msg}")
    private String paymentMsg;

    public void processPayment() {
        System.out.println(paymentMsg);
    }
}
