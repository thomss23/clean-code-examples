package com.demo.cleancode.examples.util.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private int id;
    private String email;
    private int ageSeniority;
    private int seniorityLevel;
    private String name;
    private int age;
    private double salary;
    private boolean isWorkingFullTime;
    private boolean isInFinanceDepartment;
    private EmployeeType type;

    public Employee(int id) {
        this.id = id;
    }

    public Employee(String email) {
        this.email = email;
    }
}
