package com.example.exceptionhandlerstarter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExceptionHandlerAutoConfiguration {
    @Bean
    public AdviceController adviceController() {
        return new AdviceController();
    }
}
