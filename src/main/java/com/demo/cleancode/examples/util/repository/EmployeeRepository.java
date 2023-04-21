package com.demo.cleancode.examples.util.repository;

import com.demo.cleancode.examples.util.model.Employee;

public class EmployeeRepository {

    public Employee findEmployeeById(int id) {
        return new Employee(id);
    }

    public Employee findEmployeeByEmail(String email) {
        return new Employee(email);
    }
}
