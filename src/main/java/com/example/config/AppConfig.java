package com.example.config;

import com.example.runner.AppStartupRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    AppStartupRunner appStartupRunner() {
        return new AppStartupRunner();
    }

}
