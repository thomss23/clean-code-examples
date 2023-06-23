package com.demo.cleancode.examples.errorhandling.passingnull;

import com.demo.cleancode.examples.util.model.Order;

public class OrderServiceBadExample {
    public void processOrder(Order order) {
        // Process the order
        // ...
    }
    public static void main(String[] args) {
        OrderServiceBadExample orderService = new OrderServiceBadExample();
        Order order = null;

        orderService.processOrder(order); // Potential null pointer exception
    }
}
