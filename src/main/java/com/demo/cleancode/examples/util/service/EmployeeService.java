package com.demo.cleancode.examples.util.service;

import com.demo.cleancode.examples.util.model.Employee;
import com.demo.cleancode.examples.util.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.servlet.server.Session;

@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee findEmployeeByEmail(String email) {
        return employeeRepository.findEmployeeByEmail(email);
    }

    public void loginEmployee(Employee employee) {
        //login employee and create a new session;
    }
}
