package com.example.exceptionhandlerstarter.exception;

public class OrderUnsupportedStatusException extends RuntimeException{
    public OrderUnsupportedStatusException(){
        super("Ошибка статуса заказа");
    }
}
