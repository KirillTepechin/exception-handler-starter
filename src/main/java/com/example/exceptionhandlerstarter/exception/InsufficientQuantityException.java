package com.example.exceptionhandlerstarter.exception;

public class InsufficientQuantityException extends RuntimeException{
    public InsufficientQuantityException(){
        super("Недостаточно количества товара на складе");
    }
}