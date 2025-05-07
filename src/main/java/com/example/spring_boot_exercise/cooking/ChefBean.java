package com.example.spring_boot_exercise.cooking;

import org.springframework.stereotype.Component;

@Component
public class ChefBean {
    public void cook() {
        System.out.println("cook");
    }
}
