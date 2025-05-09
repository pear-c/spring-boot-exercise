package com.example.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PaymentProcessorBean {
    @Value("${payment-msg}")
    private String paymentMsg;

    public void processPayment() {
        log.info(paymentMsg);
    }
}
