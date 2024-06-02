package com.example.exceptionhandlerstarter.exception;

public class CustomerNotFoundException extends RuntimeException{
    public CustomerNotFoundException(Long id){
        super(String.format("Пользователь с id %s не найден", id));
    }
}