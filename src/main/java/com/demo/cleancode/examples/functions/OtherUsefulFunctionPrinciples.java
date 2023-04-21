package com.demo.cleancode.examples.functions;

import com.demo.cleancode.examples.util.model.Employee;
import com.demo.cleancode.examples.util.service.EmployeeService;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class OtherUsefulFunctionPrinciples {

    private final EmployeeService employeeService;

    /**
     * Functions should have NO SIDE EFFECTS.
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

    // Ugly workaround would be to rename the function and document the side effect accordingly. However, it is not a good practice
    //Furthermore, testing the function is fairly challenging given all the dependencies created by the login side effect
    public Employee getEmployeeByEmailAndLogin(String email) {
        Employee employee = employeeService.findEmployeeByEmail(email);
        employeeService.loginEmployee(employee);
        return employee;
    }

    /**
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


//TODO remaining to be covered
    //no null parameters
    //command query separation
    //extract try/catch blocks
    //split iterators into multiple iterations -> no performance issues nowadays
}
