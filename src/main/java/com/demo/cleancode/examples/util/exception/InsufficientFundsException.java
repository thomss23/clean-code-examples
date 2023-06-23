package com.demo.cleancode.examples.util.exception;


public class InsufficientFundsException extends WithdrawalException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
