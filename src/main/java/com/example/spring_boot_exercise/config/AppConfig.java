package com.example.spring_boot_exercise.config;

import com.example.spring_boot_exercise.runner.AppStartupRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    AppStartupRunner appStartupRunner() {
        return new AppStartupRunner();
    }

}
