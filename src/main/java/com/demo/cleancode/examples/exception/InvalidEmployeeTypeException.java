package com.demo.cleancode.examples.exception;

import com.demo.cleancode.examples.util.model.EmployeeType;

public class InvalidEmployeeTypeException extends RuntimeException {

    private final EmployeeType employeeType;

    public InvalidEmployeeTypeException(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }
}
