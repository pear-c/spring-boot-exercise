package com.example.delivery;

import com.example.properties.DeliveryProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class DeliveryServiceBean {
    private final DeliveryProperties delivery;

    public void deliver() {
        log.info(delivery.getDeliveryMsg());
    }
}
