package com.demo.cleancode.examples.util.exception;

public class DeviceResponseException extends RuntimeException {
    public DeviceResponseException(String message) {
        super(message);
    }
}