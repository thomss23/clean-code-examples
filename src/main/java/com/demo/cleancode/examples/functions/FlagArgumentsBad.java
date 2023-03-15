package com.demo.cleancode.examples.functions;

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
}
