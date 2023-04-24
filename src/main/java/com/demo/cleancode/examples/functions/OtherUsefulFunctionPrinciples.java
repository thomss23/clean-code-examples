package com.demo.cleancode.examples.functions;

import com.demo.cleancode.examples.util.model.Employee;
import com.demo.cleancode.examples.util.model.WorkItem;
import com.demo.cleancode.examples.util.service.EmployeeService;
import lombok.RequiredArgsConstructor;

import java.util.List;


@RequiredArgsConstructor
public class OtherUsefulFunctionPrinciples {

    private final EmployeeService employeeService;

    /**
     * Functions should have NO SIDE EFFECTS.
     * <br>
     * <br>
     * Your function promises to do one thing, but it also does other hidden
     * things. Sometimes it will make unexpected changes to the variables of its own class.
     * Sometimes it will make them to the parameters passed into the function or to system globals. In either case they are devious and damaging mistrusts that often result in strange
     * temporal couplings and order dependencies
     */

    // Function with a hidden side effect that you do not know about as the function consumer without reading the implementation code.
    // The side effect is that it also logs in the employee, it creates a login session, adds a cookie etc
    public Employee getEmployeeByEmail(String email) {
        Employee employee = employeeService.findEmployeeByEmail(email);
        employeeService.loginEmployee(employee);
        return employee;
    }

    //Ugly workaround would be to rename the function and document the side effect accordingly. However, it is not a good practice and it violates SRP
    //Furthermore, testing the function is fairly challenging given all the dependencies created by the login side effect
    public Employee getEmployeeByEmailAndLogin(String email) {
        Employee employee = employeeService.findEmployeeByEmail(email);
        employeeService.loginEmployee(employee);
        return employee;
    }

    /**
     * Transformation functions
     * <br>
     * <br>
     * If a function acts as a transformation function (e.g. transform its input argument), it should not return void, but the input argument transformed as its output, so that it would act as an actual transformation
     * (takes an input parameter and returns an output parameter), instead of taking an input parameter (e.g an instance of Employee), transforming it and returning void
     */
    public void transformEmployeeBad(Employee employee) {
        if (employee.getAgeSeniority() > 5) {
            employee.setSeniorityLevel(3);
        }
    }

    public Employee transformEmployeeGood(Employee employee) {
        if (employee.getAgeSeniority() > 5) {
            employee.setSeniorityLevel(3);
        }
        return employee;
    }

    /**
     * Extract Try/Catch Blocks
     * <br>
     * <br>
     * Try/catch blocks are ugly in their own right. They confuse the structure of the code and
     * mix error processing with normal processing. So it is better to extract the bodies of the try
     * and catch blocks out into functions of their own
     */
    public void deleteDepartment(String departmentId) {
        try {
            deleteDepartmentAndAllEmployees(departmentId);
        } catch (Exception e) {
            handleDeleteDepartmentError(e);
        }
    }

    private void deleteDepartmentAndAllEmployees(String departmentId) {
        // delete a department and all the employees associated.
    }

    private void handleDeleteDepartmentError(Exception e) {
        // handle delete department error
    }

    /**
     * Refactor a large loop by splitting it.
     * <br>
     * <br>
     * It won't affect performance nowadays, but depends, of course, of the logic inside the for loop (like doing some very expensive operation of calling the database or a million of iterations.
     * Also, consider the memory size, if you could keep all the items in memory.
     */
    public void processWorkItem(List<WorkItem> workItems) {
        //TODO implement example
    }


//TODO remaining to be covered
    //no null parameters
    //command query separation
}
