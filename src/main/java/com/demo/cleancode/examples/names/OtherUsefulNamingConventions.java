package com.demo.cleancode.examples.names;

import com.demo.cleancode.examples.util.model.Employee;

import java.util.Date;

public class OtherUsefulNamingConventions {

    /**
     * Use long names for long scopes.
     * Add no more context to a name than is necessary
     **/
    static class EditorDescriptionsVectorGraphicsReloader {

    }

    //versus too much context
    static class PageReloaderForPagesDisplayingVectorGraphicsThatAreUsedInTheEditorDescriptions {

    }

    /**
     * When the name of a class or a function becomes too long, then it might highlight that SRP is violated and
     * the code needs refactoring into smaller functions
     **/
    public Employee getEmployeeAndCalculateNetSalaryAndHolidaysRemaining(int employeeId, int grossSalary, int numberOfHolidaysTaken) {
        System.out.println("getting employee from db, set its net salary based on gross salary and set its remaining holidays");
        return null;
    }

    /**
     * Sometimes, comments can be replaced by good named functions
     **/
    void calculateSalaryBad(Employee employee) {
        // Check to see if the employee is eligible for full benefits
        if ((employee.isInFinanceDepartment() & employee.isWorkingFullTime()) && (employee.getAgeSeniority() > 5)) {
            System.out.println("Calculating extra benefits");
        }
    }

    void calculateSalaryGood(Employee employee) {
        if (isEligibleForExtraBenefits(employee)) {
            System.out.println("Calculating extra benefits");
        }
    }

    private static boolean isEligibleForExtraBenefits(Employee employee) {
        return (employee.isInFinanceDepartment() & employee.isWorkingFullTime()) && (employee.getAgeSeniority() > 5);
    }

    /**
     * Use intention revealing names
     **/
    int daysSinceCreation;

    //versus
    int i;
    int d; // days since creation


    /**
    * Use pronounceable and  searchable names
    **/
    static class Customer {
        private Date generationTimestamp;
        private Date modificationTimestamp;;
        private final String recordId = "102";
    }

    //versus
    static class DtaRcrd102789 {
        private Date genymdhms;
        private Date modymdhms;
        private final String pszqint = "102";
    }

}
