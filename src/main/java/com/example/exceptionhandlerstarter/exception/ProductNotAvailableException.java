package com.example.exceptionhandlerstarter.exception;

public class ProductNotAvailableException extends RuntimeException{
    public ProductNotAvailableException(){
        super("Товар недоступен для заказа");
    }
}
