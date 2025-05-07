package com.example.order;

import org.springframework.stereotype.Component;

@Component
public class OrderProcessorBean {
    private final OrderReceiverBean orderReceiverBean;
    private final PaymentProcessorBean paymentProcessorBean;

    public OrderProcessorBean(OrderReceiverBean orderReceiverBean, PaymentProcessorBean paymentProcessorBean) {
        this.orderReceiverBean = orderReceiverBean;
        this.paymentProcessorBean = paymentProcessorBean;
    }

    public void processOrder() {
        orderReceiverBean.receiveOrder();
        paymentProcessorBean.processPayment();
    }
}
