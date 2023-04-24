package com.demo.cleancode.examples.functions;


import com.demo.cleancode.examples.util.exception.InvalidEmployeeTypeException;
import com.demo.cleancode.examples.util.model.Employee;
import com.demo.cleancode.examples.util.model.Money;

import java.util.Date;

public class SwitchStatementBad {

//    Main problems with the below function:
//    - it is large, and when new employee types are added, it will grow.
//    - it is very clear that it does more than one thing.
//    - it violates the Single Responsibility Principle (SRP) because there is more than one reason for it to change
//    - it violates the Open Closed Principle (OCP) because it must change whenever new types are added.
//    - imagine what it would happen is an extra country type would be added (in RO, for instance, the work week has 40 hours, in NL 36 hours etc)
//    - there are an unlimited number of other functions that will have the same structure, like isPayDay() for instance

    public Money calculatePay(Employee employee) throws InvalidEmployeeTypeException {
        switch (employee.getType()) {
            case COMMISSIONED:
                return calculateCommissionedPay(employee);
            case HOURLY:
                return calculateHourlyPay(employee);
            case SALARIED:
                return calculateSalariedPay(employee);
            default:
                throw new InvalidEmployeeTypeException(employee.getType());
        }
    }

    public boolean isPayDay(Employee employee, Date date) {
        if (isEndOfMonthDate(date)) {
            switch (employee.getType()) {
                case COMMISSIONED:
                    return false;
                case HOURLY:
                    return false;
                case SALARIED:
                    return true;
                default:
                    throw new InvalidEmployeeTypeException(employee.getType());
            }
        }
        if (isDateBetweenTheFirst10DaysOfMonth(date)) {
            switch (employee.getType()) {
                case COMMISSIONED:
                    return true;
                case HOURLY:
                    return false;
                case SALARIED:
                    return false;
                default:
                    throw new InvalidEmployeeTypeException(employee.getType());
            }
        }
        return false;
    }

    private Money calculateCommissionedPay(Employee employee) {
        //do some logic with employee and calculate salary based on commission
        return new Money();
    }

    private Money calculateHourlyPay(Employee employee) {
        //do some logic with employee and calculate salary based on the number of hours worked
        return new Money();
    }

    private Money calculateSalariedPay(Employee employee) {
        //do some logic with employee and calculate salary regularly
        return new Money();
    }

    private boolean isDateBetweenTheFirst10DaysOfMonth(Date date) {
        return false;
    }

    private boolean isEndOfMonthDate(Date date) {
        return false;
    }
}


