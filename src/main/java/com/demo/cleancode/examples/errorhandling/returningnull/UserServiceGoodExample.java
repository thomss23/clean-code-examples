package com.demo.cleancode.examples.errorhandling.returningnull;

import com.demo.cleancode.examples.util.exception.UserNotFoundException;
import org.apache.catalina.User;

/**
 <strong>When we return null, we are essentially creating work for ourselves and foisting
 problems upon our callers.</strong>
 <br>
 All it takes is one missing null check to send an application
 spinning out of control.
 **/
public class UserServiceGoodExample {
    public User getUserById(int userId) {
        // Retrieve user from database or other data source
        // If user not found, throw an exception
        throw new UserNotFoundException("User not found for ID: " + userId);
    }

    public static void main(String[] args) {
        UserServiceGoodExample userService = new UserServiceGoodExample();
        int userId = 123;

        try {
            User user = userService.getUserById(userId);
            System.out.println("User: " + user.getName());
        } catch (UserNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            // Additional error handling or recovery logic...
        }
    }
}
