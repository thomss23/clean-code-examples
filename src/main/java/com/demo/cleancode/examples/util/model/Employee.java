package com.demo.cleancode.examples.util.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

    private int id;
    private int ageSeniority;
    private boolean isWorkingFullTime;
    private boolean isInFinanceDepartment;

    public Employee(int id) {
        this.id = id;
    }
}
