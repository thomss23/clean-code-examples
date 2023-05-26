package com.demo.cleancode.examples.comments.badcomments;

/**
At first glance, the comment for the calculateArea() method seems accurate and helpful.
 However, the method actually has a bug - it does not handle negative radii correctly.

 The comment is misleading because it implies that the method is doing what it's supposed to do, when in fact it has a bug that can cause unexpected results.
 The comment should be updated to reflect the bug and explain the limitations of the method.


 **/
public class MisleadingComments {

    //This method calculates the area of a circle.
    public double calculateArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }

    public double calculateAreaFixed(double radius) {
        if (radius < 0) {
            return Double.NaN;
        }
        double area = Math.PI * radius * radius;
        return area;
    }
}

