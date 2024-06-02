package com.example.exceptionhandlerstarter;

import org.springframework.context.annotation.Bean;

public class ExceptionHandlerAutoConfiguration {
    @Bean
    public AdviceController adviceController(){return new AdviceController();}
}
