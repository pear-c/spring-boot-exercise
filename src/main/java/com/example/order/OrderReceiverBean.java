package com.example.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class OrderReceiverBean {
    @Value("${receive-msg}")
    private String receiveMsg;

    public void receiveOrder() {
        log.info(receiveMsg);
    }
}
