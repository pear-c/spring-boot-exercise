package com.example.order;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfig {

    @Bean
    @ConditionalOnClass({OrderReceiverBean.class, PaymentProcessorBean.class})
    OrderProcessorBean orderProcessorBean(OrderReceiverBean receiver, PaymentProcessorBean payment) {
        return new OrderProcessorBean(receiver, payment);
    }
}
