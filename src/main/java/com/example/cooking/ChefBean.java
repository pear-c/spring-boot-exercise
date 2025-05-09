package com.example.cooking;

import com.example.properties.CookingProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class ChefBean {
    private final CookingProperties cook;

    public void cook() {
        log.info(cook.getCookingMsg());
    }
}
