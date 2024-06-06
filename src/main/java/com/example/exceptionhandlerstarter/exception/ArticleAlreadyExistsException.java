package com.example.exceptionhandlerstarter.exception;

public class ArticleAlreadyExistsException extends RuntimeException{
    public ArticleAlreadyExistsException(String article){
        super(String.format("Товар с артикулом %s уже существует", article));
    }
}