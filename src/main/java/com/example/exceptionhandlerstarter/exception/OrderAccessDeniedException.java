package com.example.exceptionhandlerstarter.exception;

public class OrderAccessDeniedException extends RuntimeException{
    public OrderAccessDeniedException(){
        super("Доступ к заказу запрещен");
    }
}
