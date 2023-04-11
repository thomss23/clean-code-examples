package com.demo.cleancode.examples.functions;

import com.demo.cleancode.examples.exception.InvalidEmployeeTypeException;
import com.demo.cleancode.examples.util.model.Employee;
import com.demo.cleancode.examples.util.model.EmployeeType;
import com.demo.cleancode.examples.util.model.Money;

import static com.demo.cleancode.examples.util.model.EmployeeType.*;

/**
 * It’s hard to make a small switch statement. Even a switch statement with only two cases is
 * larger than we would like a single block or function to be. It’s also hard to make a switch statement that does one thing.
 * By their nature, switch statements always do N things. Unfortunately, we can’t always avoid switch statements, but we can make sure that each switch
 * statement is buried in a low-level class and is never repeated. We could do this with polymorphism
 **/
public class SwitchStatementGood {

    //In the below example, the switch statement is buried in the basement of an ABSTRACT FACTORY. The factory will use the
    //switch statement to create appropriate instances of the derivatives of Employee, and the various functions employeeType specifics, such as calculatePay, isPayday, and deliverPay,
    // which will be dispatched polymorphically through the Employee interface

    public interface EmployeeFactory {
        Employee createEmployee(EmployeeType employeeType) throws InvalidEmployeeTypeException;
        // other generic employee related methods;
    }

    public class RomanianEmployeeFactory implements EmployeeFactory {
        public Employee createEmployee(EmployeeType employeeType) throws InvalidEmployeeTypeException {
            switch (employeeType) {
                case COMMISSIONED:
                    return new CommissionedEmployee(employeeType);
                case HOURLY:
                    return new HourlyEmployee(employeeType);
                case SALARIED:
                    return new SalariedEmployee(employeeType);
                default:
                    throw new InvalidEmployeeTypeException(employeeType);
            }
        }
    }

    public abstract class Employee {
        public abstract boolean isPayday();
        public abstract Money calculatePay();
        public abstract void deliverPay(Money pay);
    }

    public class CommissionedEmployee extends Employee {

        public CommissionedEmployee(EmployeeType employeeType) {

        }

        @Override
        public boolean isPayday() {
            return false;
        }

        @Override
        public Money calculatePay() {
            return null;
        }

        @Override
        public void deliverPay(Money pay) {

        }
    }

    public class HourlyEmployee extends Employee {

        public HourlyEmployee(EmployeeType employeeType) {

        }

        @Override
        public boolean isPayday() {
            return false;
        }

        @Override
        public Money calculatePay() {
            return null;
        }

        @Override
        public void deliverPay(Money pay) {

        }
    }

    public class SalariedEmployee extends Employee {

        public SalariedEmployee(EmployeeType employeeType) {

        }

        @Override
        public boolean isPayday() {
            return false;
        }

        @Override
        public Money calculatePay() {
            return null;
        }

        @Override
        public void deliverPay(Money pay) {

        }
    }
}
