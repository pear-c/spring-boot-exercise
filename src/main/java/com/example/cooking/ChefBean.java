package com.example.cooking;

import com.example.properties.CookingProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ChefBean {
    private final CookingProperties cook;

    public void cook() {
        System.out.println(cook.getCookingMsg());
    }
}
