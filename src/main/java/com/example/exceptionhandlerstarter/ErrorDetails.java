package com.example.exceptionhandlerstarter;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
public class ErrorDetails {
    private String exceptionName;
    private List<String> messages;
    private LocalDateTime time;
    private String exceptionClass;
}
