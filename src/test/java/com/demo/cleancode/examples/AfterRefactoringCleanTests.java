package com.demo.cleancode.examples;

import com.demo.cleancode.examples.util.model.Item;
import com.demo.cleancode.examples.util.model.ShippingCalculator;
import com.demo.cleancode.examples.util.model.ShoppingCart;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    One assert pert test rule
    Clean tests
 */
public class AfterRefactoringCleanTests {

    @Test
    public void testCalculateShippingCost() {
        ShoppingCart cart = createFilledCart();
        double totalWeight = cart.getTotalWeight();

        double shippingCost = calculateShippingCost(totalWeight);

        assertShippingCost(5.0, shippingCost);
    }

    private ShoppingCart createFilledCart() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("123", "Product A", 10.99));
        cart.addItem(new Item("456", "Product B", 24.99));
        cart.addItem(new Item("789", "Product C", 15.99));
        return cart;
    }

    private double calculateShippingCost(double totalWeight) {
        return ShippingCalculator.calculateShippingCost(totalWeight);
    }

    private void assertShippingCost(double expectedCost, double actualCost) {
        double delta = 0.01;
        assertEquals(expectedCost, actualCost, delta);
    }
}
