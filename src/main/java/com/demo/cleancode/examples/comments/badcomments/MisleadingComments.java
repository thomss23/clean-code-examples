package com.demo.cleancode.examples.comments.badcomments;

/**
At first glance, the comment for the calculateArea() method seems accurate and helpful.

 The comment is misleading because it implies that the method is calculating the area of a rectangle.
 The comment should be updated or removed at all and the behavior could be better reflected in the method's name.


 **/
public class MisleadingComments {

    //This method calculates the area of a rectangle.
    public double calculateArea(double radius) {
        if (radius < 0) {
            return Double.NaN;
        }
        double area = Math.PI * radius * radius;
        return area;
    }

}

