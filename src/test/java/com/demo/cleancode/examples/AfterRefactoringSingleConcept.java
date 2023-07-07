package com.demo.cleancode.examples;

import com.demo.cleancode.examples.util.model.Item;
import com.demo.cleancode.examples.util.model.ShoppingCart;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AfterRefactoringSingleConcept {

    @Test
    public void testCalculateTotalPrice_WithoutDiscount() {
        ShoppingCart cart = createFilledCart();
        double totalPrice = cart.calculateTotalPrice();

        assertEquals(35.98, totalPrice, 0.01);
    }

    @Test
    public void testCalculateTotalPrice_WithDiscountApplied() {
        ShoppingCart cart = createFilledCart();
        double discountedPrice = cart.calculateTotalPriceWithDiscount(0.1);

        assertEquals(31.78, discountedPrice, 0.01);
    }

    private ShoppingCart createFilledCart() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("123", "Product A", 10.99));
        cart.addItem(new Item("456", "Product B", 24.99));
        return cart;
    }
}
