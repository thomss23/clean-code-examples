package com.demo.cleancode.examples.comments.badcomments;

/*
In this code, the comment "This function calculates the average of the given array" is misleading,
as the method actually calculates the integer division of the sum of the array elements by the length of the array.
This means that if the sum of the array elements is not evenly divisible by the length of the array, the calculated "average" will be incorrect.
 */
public class MisleadingComments {
    // This function calculates the average of the given array
    public double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length; // divide by the number of elements in the array to get the average
    }
}
