package com.goatmanager.helper;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<Map<String,Object>> handleException(MethodArgumentNotValidException ex){
        Map<String,Object> map = new HashMap<>();
        map.put("status", HttpStatus.BAD_REQUEST.value());
        map.put("error", "Validation Failed");
        Map<String, String> fieldErrors = new LinkedHashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            fieldErrors.put(error.getDefaultMessage(), error.getDefaultMessage());
        });
        map.put("fieldErrors", fieldErrors);
        return ResponseEntity.badRequest().body(map);
    }
}
