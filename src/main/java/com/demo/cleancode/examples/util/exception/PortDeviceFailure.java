package com.demo.cleancode.examples.util.exception;

public class PortDeviceFailure extends RuntimeException{
    public PortDeviceFailure(RuntimeException exception) {
        super(exception.getMessage());
    }
}
