package com.example.exceptionhandlerstarter.exception;

import java.util.UUID;

/**
 * Исключение, которое выбрасывается, когда товар с указанным UUID не найден
 */
public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(UUID uuid){
        super(String.format("Товар с uuid %s не найден", uuid));
    }
}
