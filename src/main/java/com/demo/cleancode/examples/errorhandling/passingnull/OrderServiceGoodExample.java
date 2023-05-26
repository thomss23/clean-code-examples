package com.demo.cleancode.examples.errorhandling.passingnull;

import com.demo.cleancode.examples.util.model.Order;
/**

 Returning null from methods is bad, but passing null into methods is worse.
 Unless you are working with an API which expects you to pass null,
 you should avoid passing null in your code whenever possible.

 In most programming languages there is no good way to deal with a null that is
 passed by a caller accidentally. Because this is the case, the rational approach is to forbid
 passing null by default. When you do, you can code with the knowledge that a null in an
 argument list is an indication of a problem, and end up with far fewer careless mistakes.
 **/
public class OrderServiceGoodExample {
    public void processOrder(Order order) {
        if (order == null) {
            throw new IllegalArgumentException("Order cannot be null.");
        }

        // Process the order
        // ...
    }

    public static void main(String[] args) {
        OrderServiceGoodExample orderService = new OrderServiceGoodExample();
        Order order = new Order();

        orderService.processOrder(order);
    }
}
