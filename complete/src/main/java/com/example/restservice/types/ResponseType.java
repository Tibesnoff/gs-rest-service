package com.example.restservice.types;

public class ResponseType<T> {
    private T message;
    private String status;

    public ResponseType(T message, String status) {
        this.message = message;
        this.status = status;
    }

    public T getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }
}
