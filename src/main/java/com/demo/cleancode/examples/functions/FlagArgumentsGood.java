package com.demo.cleancode.examples.functions;

import com.demo.cleancode.examples.util.model.Booking;
import com.demo.cleancode.examples.util.model.Employee;

/**
 * Flag arguments are ugly. Passing a boolean into a function is a truly terrible practice.
 * It immediately complicates the signature of the method, loudly proclaiming that this function
 * does more than one thing. It does one thing if the flag is true and another if the flag is false.
 * <br>
 * <br>
 * Further reading on this topic -> <strong>cyclomatic complexity</strong>, a term of measuring the amount of control flows in a chunk of code.
 * Cyclomatic complexity increases dramatically with the number of flag arguments: a method which takes two booleans can have a complexity up to 4.
 * Also, a switch statement has a cyclomatic complexity equal to the number of cases
 * <br>
 * <br>
 * Rather than using a flag argument, separate methods is preferred, because they communicate more clear what the intentions are, instead of having to remember the meaning of the flag variable.
 **/
public class FlagArgumentsGood {

    public void printReportWithHeaderAndFooter(String reportData) {
        System.out.println("=== Report Header ===");
        System.out.println(reportData);
        System.out.println("=== Report Footer ===");
    }

    public void printReportWithHeader(String reportData) {
        System.out.println("=== Report Header ===");
        System.out.println(reportData);
    }

    public void printReportWithFooter(String reportData) {
        System.out.println(reportData);
        System.out.println("=== Report Footer ===");
    }

    public void printReport(String reportData) {
        System.out.println(reportData);
    }

    //another example
    public Booking createRegularBooking(Employee aEmployee, boolean isPremium) {
        return new Booking("randomId", "regular");
    }

    public Booking createPremiumBooking(Employee aEmployee, boolean isPremium) {
        return new Booking("randomId", "premium");
    }
}
