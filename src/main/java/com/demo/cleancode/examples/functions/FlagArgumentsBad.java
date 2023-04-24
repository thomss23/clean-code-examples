package com.demo.cleancode.examples.functions;


import com.demo.cleancode.examples.util.model.Booking;
import com.demo.cleancode.examples.util.model.Employee;

public class FlagArgumentsBad {

    public void printReport(boolean includeHeader, boolean includeFooter, String reportData) {
        if (includeHeader) {
            System.out.println("=== Report Header ===");
        }
        System.out.println(reportData);
        if (includeFooter) {
            System.out.println("=== Report Footer ===");
        }
    }

    //another example
    public Booking createBooking(Employee aEmployee, boolean isPremium) {
        if (isPremium) {
            // logic for premium booking
            return new Booking("randomId", "premium");
        } else {
            // logic for regular booking
            return new Booking("randomId", "regular");
        }
    }
}
