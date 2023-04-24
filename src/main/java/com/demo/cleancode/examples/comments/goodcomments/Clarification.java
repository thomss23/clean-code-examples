package com.demo.cleancode.examples.comments.goodcomments;

import com.demo.cleancode.examples.util.model.CompanyRole;
import com.demo.cleancode.examples.util.model.Employee;
/*
it's not immediately clear why a manager's salary is multiplied by 1.2 and a staff member's salary is multiplied by 1.1.
 Adding a clarification comment would make the code more understandable
 */

//TODO: try to find a better example
public class Clarification {

    public void calculateSalary(Employee employee) {
        // Managers get a 20% salary increase as mentioned in the latest HR standard.
        if (employee.getRole() == CompanyRole.MANAGER) {
            employee.setSalary(employee.getSalary() * 1.2);
            // Staff members get a 10% salary increase as mentioned in the latest HR standard.
        } else if (employee.getRole() == CompanyRole.STAFF) {
            employee.setSalary(employee.getSalary() * 1.1);
        }
    }

}
