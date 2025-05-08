package com.example.order;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderProcessorBean {
    private final OrderReceiverBean orderReceiverBean;
    private final PaymentProcessorBean paymentProcessorBean;

    public void processOrder() {
        orderReceiverBean.receiveOrder();
        paymentProcessorBean.processPayment();
    }
}
