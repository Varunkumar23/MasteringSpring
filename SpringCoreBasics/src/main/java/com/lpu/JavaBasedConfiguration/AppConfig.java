package com.lpu.JavaBasedConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.lpu.JavaBasedConfiguration")

public class AppConfig {

    @Bean
    public Engine engine() {
        return new Engine();
    }
}
