package com.demo.cleancode.examples.errorhandling.uncheckedExceptions;

/**
 * Java programmers have long debated the pros and cons of checked exceptions.
 * Initially, checked exceptions seemed like a great idea.
 * They required every method to declare the exceptions it could throw, making the code more explicit.
 * However, <strong>the use of checked exceptions comes with a price.</strong>
 * <br>
 * <br>
 * <strong>One major drawback is that checked exceptions violate the Open/Closed Principle.</strong>
 * If a method throws a checked exception that needs to be caught three levels above, <strong>all the methods in between must declare and handle the exception in their signatures.</strong>
 * This means that a change in a low-level module can force signature changes on many higher-level modules, requiring them to be rebuilt and redeployed unnecessarily.
 * <br>
 * <br>
 * Consider a large system with a hierarchical calling structure. If a lower-level function is modified to throw a checked exception,
 * <strong>every function that calls it must also be modified to handle or propagate the exception.</strong>
 * This leads to a cascade of changes from the lowest to the highest levels of the software.
 * <br>
 * <br>
 * Furthermore, <strong>checked exceptions break encapsulation since all functions in the exception's path must be aware of the specific details of the low-level exception.</strong>
 * This goes against the purpose of exceptions, which is to allow handling errors at a distance.
 * <br>
 * <br>
 * In summary, while checked exceptions have their advantages, the drawbacks include violating the Open/Closed Principle, creating cascading changes, and breaking encapsulation.
 * These factors have fueled ongoing discussions among Java programmers.
 **/
public class MathUtilsGood {

    public static double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        double dividend = 10.0;
        double divisor = 0.0;

        double result = MathUtilsGood.divide(dividend, divisor);
        System.out.println("Result: " + result);
    }
}
