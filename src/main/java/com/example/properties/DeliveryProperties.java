package com.example.properties;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@AllArgsConstructor
@Getter
@ConfigurationProperties("delivery")
public class DeliveryProperties {
    private String deliveryMsg;
}
