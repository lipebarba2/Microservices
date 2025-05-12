package com.msvc.hotel.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionController extends RuntimeException{

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String,Object>> handlerResourceNotFoundException(ResourceNotFoundException ressourceNotFoundException) {
        Map<String, Object> map = new HashMap<>();
        map.put("message", ressourceNotFoundException.getMessage());
        map.put("success", false);
        map.put("status", 404);
        return ResponseEntity.status(404).body(map);
    }


}
