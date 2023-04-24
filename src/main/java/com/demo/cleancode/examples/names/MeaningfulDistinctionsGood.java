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
 * Make meaningful distinctions. Pick one word for one abstract concept and stick with it across the codebase.
 * If you are using getValue() to return a value of something, use the same concept;
 * Instead of using getValue() in all the code, using alternatively fetchValue(), retrieveValue() will confuse the reader.
 **/
@RequiredArgsConstructor
public class MeaningfulDistinctionsGood {

    private final EmployeeRepository employeeService;
    private final DepartmentRepository departmentRepository;
    private final ManagerRepository managerRepository;

    public Employee getEmployee(int employeeId) {
        return employeeService.findEmployeeById(employeeId);
    }

    public Department getDepartment(int departmentId) {
        return departmentRepository.findDepartmentById(departmentId);
    }

    public Manager getManager(int managerId) {
        return managerRepository.findManagerId(managerId);
    }

    public List<Manager> getManagers()  {
        return managerRepository.findAll();
    }
}
