package com.demo.cleancode.examples;

import com.demo.cleancode.examples.util.model.Item;
import com.demo.cleancode.examples.util.model.ShippingCalculator;
import com.demo.cleancode.examples.util.model.ShoppingCart;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeforeRefactoringCleanTests {

    public void testCalculateShippingCost() {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("123", "Product A", 10.99);
        Item item2 = new Item("456", "Product B", 24.99);
        Item item3 = new Item("789", "Product C", 15.99);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        double totalWeight = cart.getTotalWeight();
        double shippingCost = ShippingCalculator.calculateShippingCost(totalWeight);

        assertEquals(5.0, shippingCost, 0.01);
    }
}
