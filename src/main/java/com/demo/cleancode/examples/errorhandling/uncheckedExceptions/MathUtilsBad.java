package com.demo.cleancode.examples.errorhandling.uncheckedExceptions;

class MathUtilsBad {
    public static double divide(double dividend, double divisor) throws Exception {
        if (divisor == 0) {
            throw new Exception("Divisor cannot be zero.");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        double dividend = 10.0;
        double divisor = 0.0;

        try {
            double result = MathUtilsBad.divide(dividend, divisor);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            // Additional error handling or recovery logic...
        }
    }
}
