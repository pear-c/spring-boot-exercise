package com.example.delivery;

import com.example.properties.DeliveryProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class DeliveryServiceBean {
    private final DeliveryProperties delivery;

    public void deliver() {
        System.out.println(delivery.getDeliveryMsg());
    }
}
