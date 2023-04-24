package com.demo.cleancode.examples.functions;

import com.demo.cleancode.examples.util.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SmallFunctionsBad {

    public List<Employee> processEmployeeData(List<Map<String, Object>> dataList) {
        List<Employee> employeeList = new ArrayList<>();
        for (Map<String, Object> dataMap : dataList) {
            Employee employee = new Employee();
            employee.setId((int) dataMap.get("id"));
            employee.setName((String) dataMap.get("name"));
            employee.setAge((int) dataMap.get("age"));
            int hoursWorked = (int) dataMap.get("hoursWorked");
            double hourlyRate = (double) dataMap.get("hourlyRate");
            int yearsOfService = (int) dataMap.get("yearsOfService");
            double salary;
            if (hoursWorked <= 40) {
                salary = hoursWorked * hourlyRate;
            } else {
                int overtimeHours = hoursWorked - 40;
                double overtimeRate = hourlyRate * 1.5;
                salary = (40 * hourlyRate) + (overtimeHours * overtimeRate);
            }
            employee.setSalary(salary);
            int seniorityLevel;
            if (yearsOfService <= 5) {
                seniorityLevel = 1;
            } else if (yearsOfService <= 10) {
                seniorityLevel = 2;
            } else if (yearsOfService <= 15) {
                seniorityLevel = 3;
            } else {
                seniorityLevel = 4;
            }
            employee.setSeniorityLevel(seniorityLevel);
            employeeList.add(employee);
        }
        return employeeList;
    }
}
