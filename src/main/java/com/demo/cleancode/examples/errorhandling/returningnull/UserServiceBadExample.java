package com.demo.cleancode.examples.errorhandling.returningnull;

import org.apache.catalina.User;

public class UserServiceBadExample {
    public User getUserById(int userId) {
        // Retrieve user from database or other data source
        // If user not found, return null
        return null;
    }

    public static void main(String[] args) {
        UserServiceBadExample userService = new UserServiceBadExample();
        int userId = 123;

        User user = userService.getUserById(userId);

        if (user != null) {
            System.out.println("User: " + user.getName());
        } else {
            System.out.println("User not found.");
            // Additional error handling or recovery logic...
        }
    }
}
