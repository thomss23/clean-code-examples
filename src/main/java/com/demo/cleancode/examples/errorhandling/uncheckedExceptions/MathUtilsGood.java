package com.demo.cleancode.examples.errorhandling.uncheckedExceptions;

/**

 For years Java programmers have debated over the benefits and liabilities of checked exceptions.
 When checked exceptions were introduced in the first versionof Java, they seemed like a great idea.
 The signature of every method would list all of theexceptions that it could pass to its caller.
 Moreover, these exceptions were part of the typeof the method.
 Your code literally wouldn’t compile if the signature didn’t match what yourcode could do.

 The price of checked exceptions is an Open/Closed Principle1 violation.
 If you throw a checked exception from a method in your code and the catch is three levels
 above, you must declare that exception in the signature of each method between you and
 the catch. This means that a change at a low level of the software can force signature
 changes on many higher levels. The changed modules must be rebuilt and redeployed,
 even though nothing they care about changed.

 Consider the calling hierarchy of a large system. Functions at the top call functions
 below them, which call more functions below them, ad infinitum. Now let’s say one of the
 lowest level functions is modified in such a way that it must throw an exception. If that
 exception is checked, then the function signature must add a throws clause. But this
 means that every function that calls our modified function must also be modified either to
 catch the new exception or to append the appropriate throws clause to its signature. Ad
 infinitum. The net result is a cascade of changes that work their way from the lowest levels
 of the software to the highest! Encapsulation is broken because all functions in the path
 of a throw must know about details of that low-level exception. Given that the purpose of
 exceptions is to allow you to handle errors at a distance, it is a shame that checked
 exceptions break encapsulation in this way.

 **/
public  class MathUtilsGood {
    public static double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        double dividend = 10.0;
        double divisor = 0.0;

        try {
            double result = MathUtilsGood.divide(dividend, divisor);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            // Additional error handling or recovery logic...
        }
    }
}
