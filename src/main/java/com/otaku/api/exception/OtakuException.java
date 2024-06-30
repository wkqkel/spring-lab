package com.otaku.api.exception;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public abstract class OtakuException extends RuntimeException {
    private final Map<String, String> validation = new HashMap<>();

    public OtakuException(String message) {
        super(message);
    }

    public OtakuException(String message, Throwable cause) {
        super(message, cause);
    }

    public abstract int getStatusCode();

    public void addValidation(String fieldName, String message) {
        validation.put(fieldName, message);
    }
}
