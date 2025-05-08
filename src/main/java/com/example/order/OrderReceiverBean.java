package com.example.order;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OrderReceiverBean {
    @Value("${receive-msg}")
    private String receiveMsg;

    public void receiveOrder() {
        System.out.println(receiveMsg);
    }
}
