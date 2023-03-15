package com.demo.cleancode.examples.functions;

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
}
