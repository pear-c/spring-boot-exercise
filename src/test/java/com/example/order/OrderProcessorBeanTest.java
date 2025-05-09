package com.example.order;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class OrderProcessorBeanTest {

    @Mock
    OrderReceiverBean orderReceiverBean;
    @Mock
    PaymentProcessorBean paymentProcessorBean;

    @InjectMocks
    OrderProcessorBean orderProcessorBean;

    @Test
    void processOrder() {
        orderProcessorBean.processOrder();

        Mockito.verify(orderReceiverBean, Mockito.atLeastOnce()).receiveOrder();
        Mockito.verify(paymentProcessorBean, Mockito.atLeastOnce()).processPayment();
    }
}