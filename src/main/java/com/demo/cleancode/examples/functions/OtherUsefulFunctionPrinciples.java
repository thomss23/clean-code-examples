package com.demo.cleancode.examples.functions;

import com.demo.cleancode.examples.util.model.Employee;
import com.demo.cleancode.examples.util.model.EmployeeInfo;
import com.demo.cleancode.examples.util.service.EmployeeService;
import lombok.RequiredArgsConstructor;


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
     * Don't Pass Null arguments to a method. This is a design mistake
     * <br>
     * <br>
     * Returning null from methods is bad, but passing null into methods is even worse. Unless you
     * are working with an API which expects you to pass null for an optional field, you should avoid passing null in
     * your code whenever possible.
     * <br>
     * <br>
     * A classic frequently encountered example is when you have a method with many arguments and you need to add another argument that will be used only for a specific case.
     * In all other cases, the method is called with null. You add a nullable param in order to reuse the same method.
     */
    public void processEmployeeInfo() {
        //data to process is read from some table or file
        methodWithNonNullableArguments("Mary", "Manager", 25, "Red");
        methodWithNonNullableArguments("John", "Hr", 27, "Yellow");
        methodWithNonNullableArguments("Tom", "Manager", 29, "Green");

    }

    private void methodWithNonNullableArguments(String name, String type, int age, String color) {
        //implement logic for name, type, age, color
    }

    //at some point in the future you need to add an extra logic for an employee's address, which is not always present.
    // This is when you decide to reuse the same method and add a nullable argument to it, address

    public void processEmployeeInfoWithAddress() {
        //data to process is read from some table or file
        methodWithOneNullableArguments("Mary", "Manager", 25, "Red", null);
        methodWithOneNullableArguments("John", "Hr", 27, "Yellow", "Bucharest,Dacia One street");
        methodWithOneNullableArguments("Tom", "Manager", 29, "Green", null);
    }

    private void methodWithOneNullableArguments(String name, String type, int age, String color, String address) {
        //implement logic for name, type, age, color
        if (address != null) {
            System.out.println("Do something with address also, like send a postal card");
        }
    }

    //One possible refactoring solutions:

    public void processEmployeeInfoWithAddressRefactored() {
        //data to process is read from some table or file
        methodWithArgumentObject(new EmployeeInfo("Mary", "Manager", 25, "Red", null));
        methodWithArgumentObject(new EmployeeInfo("John", "Hr", 27, "Yellow", "Bucharest,Dacia One street"));
        methodWithArgumentObject(new EmployeeInfo("Tom", "Manager", 29, "Green", null));
    }

    private void methodWithArgumentObject(EmployeeInfo employeeInfo) {
        //implement logic for name, type, age, color
        if (employeeInfo.getAddress() != null) {
            System.out.println("Do something with address also, like send a postal card");
        }
    }

    /**
     * Now imagine if you would have more than 1 argument nullable. This would make the code even harder to read, as you have to count and look at the definition of the method to understand
     * what's going on. Furthermore, you have a function with  many parameters that takes multiple distinct parameters of the same time, which is more difficult to mentally parse
     */
    public void processEmployeeInfoWithMultipleNullableFields() {
        //data to process is read from some table or file
        methodWithMultipleNullableArguments("Mary", null, 25, null, null);
        methodWithMultipleNullableArguments("John", "Hr", 27, "Yellow", "Bucharest,Dacia One street");
        methodWithMultipleNullableArguments("Tom", null, 29, "Green", null);
    }

    private void methodWithMultipleNullableArguments(String name, String type, int age, String color, String address) {
        if (type != null) {
            System.out.println("Do something with type");
        }
        if (color != null) {
            System.out.println("Do something with color");
        }
        if (address != null) {
            System.out.println("Do something with address also, like send a postal card");
        }
    }

    // Other possible refactoring solutions:
    //- exception/error handling when address is null
    //- set default values in EmployeeInfo  for null arguments
    //- use the Builder pattern for EmployeeInfo
    //- use Optional for the nullable method arguments, but this makes the code harder to read most of the times
    //- handle null parameters logic in different method logic
}
