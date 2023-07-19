package com.demo.cleancode.examples.functions;

import com.demo.cleancode.examples.util.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <strong>How small should a function be? </strong> The answer is as short as possible :)
 * <br>
 * <br>
 * <strong> Rule 1 </strong>: functions should be small
 * <br>
 * <strong> Rule 2 </strong>: functions should be smaller than that:)
 * Ideally, a function should do only one thing.
 * <br>
 * <strong> Rule 3 </strong>: In order to make sure our functions are doing “one thing,” we need to make sure that the
 * statements within our function are all at the same level of abstraction
 * <br>
 * <br>
 * <strong>How Short is Too Short?</strong>
 * <br></br>
 * When the code you extract is more readable than the function name you replace it with, you’ve gone too far. That’s why there’s not a hard and fast rule on how many lines of code we should have in a function, merely some guidelines.
 **/
public class SmallFunctionsGood {

    private static final int TOTAL_MONTH_HOURS = 160;
    private static final double OVERTIME_INCREASE_RATE = 1.5;

    public List<Employee> processEmployeeDataList(List<Map<String, Object>> dataList) {
        List<Employee> employeeList = new ArrayList<>();
        for (Map<String, Object> dataMap : dataList) {
            Employee employee = processEmployeeData(dataMap);
            employeeList.add(employee);
        }
        return employeeList;
    }

    private Employee processEmployeeData(Map<String, Object> dataMap) {
        Employee employee = new Employee();
        employee.setName((String) dataMap.get("name"));
        employee.setAge((int) dataMap.get("age"));
        employee.setSeniorityLevel(calculateSeniority((int) dataMap.get("yearsOfService")));
        employee.setSalary(calculateSalary((int) dataMap.get("hoursWorked"), (double) dataMap.get("hourlyRate")));
        return employee;
    }

    private int calculateSeniority(int yearsOfService) {
        if (yearsOfService <= 5) {
            return 1;
        } else if (yearsOfService <= 10) {
            return 2;
        } else if (yearsOfService <= 15) {
            return 3;
        } else {
            return 4;
        }
    }

    private double calculateSalary(int hoursWorked, double hourlyRate) {
        if (hasOvertime(hoursWorked)) {
            return calculateSalaryWithOvertime(hoursWorked, hourlyRate);
        }
        return calculateRegularSalary(hoursWorked, hourlyRate);
    }

    private boolean hasOvertime(int hoursWorked) {
        return hoursWorked > TOTAL_MONTH_HOURS;
    }

    private double calculateSalaryWithOvertime(int hoursWorked, double hourlyRate) {
        int overtimeHours = hoursWorked - TOTAL_MONTH_HOURS;
        double overtimeRate = hourlyRate * OVERTIME_INCREASE_RATE;
        return (TOTAL_MONTH_HOURS * hourlyRate) + (overtimeHours * overtimeRate);
    }

    private double calculateRegularSalary(int hoursWorked, double hourlyRate) {
        return hoursWorked * hourlyRate;
    }
}
