package com.demo.cleancode.examples.comments.goodcomments;

import com.demo.cleancode.examples.util.model.Order;

/*
TODOs are jobs that the programmer thinks should be done, but for some reason
can’t do at the moment. It might be a reminder to delete a deprecated feature or a
plea for someone else to look at a problem. It might be a request for someone else to
think of a better name or a reminder to make a change that is dependent on a
planned event. Whatever else a TODO might be, it is not an excuse to leave bad code in
the system.
 */
public class TODOComments {
    public void processOrder(Order order) {
        // TODO: Refactor this method to remove duplicate code
        if (order.isInternational()) {
            // process international order
        } else {
            // process domestic order
        }
    }
}
