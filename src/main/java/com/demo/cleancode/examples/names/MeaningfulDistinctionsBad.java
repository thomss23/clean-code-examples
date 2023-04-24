package com.demo.cleancode.examples.names;

import com.demo.cleancode.examples.util.model.Department;
import com.demo.cleancode.examples.util.model.Employee;
import com.demo.cleancode.examples.util.model.Manager;
import com.demo.cleancode.examples.util.repository.DepartmentRepository;
import com.demo.cleancode.examples.util.repository.EmployeeRepository;
import com.demo.cleancode.examples.util.repository.ManagerRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * Non-meaningful distinctions.
 * 3 different words are used for the same purpose - GET
 **/
@RequiredArgsConstructor
public class MeaningfulDistinctionsBad {

    private final EmployeeRepository employeeService;
    private final DepartmentRepository departmentRepository;
    private final ManagerRepository managerRepository;

    public Employee fetchEmployee(int employeeId) {
        return employeeService.findEmployeeById(employeeId);
    }

    public Department getDepartment(int departmentId) {
        return departmentRepository.findDepartmentById(departmentId);
    }

    public Manager retrieveManager(int managerId) {
        return managerRepository.findManagerId(managerId);
    }

    public List<Manager> fetchManagers()  {
        return managerRepository.findAll();
    }
}
