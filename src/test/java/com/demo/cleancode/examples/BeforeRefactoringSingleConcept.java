package com.demo.cleancode.examples;

import com.demo.cleancode.examples.util.model.Item;
import com.demo.cleancode.examples.util.model.ShoppingCart;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeforeRefactoringSingleConcept {

    @Test
    public void testCalculateTotalPriceWithDiscountAndTotalPrice() {
        ShoppingCart cart = createFilledCart();
        double discount = 0.1;

        double totalPrice = cart.calculateTotalPrice();

        double discountedPrice = totalPrice - (totalPrice * discount);
        assertEquals(31.78, discountedPrice, 0.01);
        assertEquals(35.98, totalPrice, 0.01);
    }

    private ShoppingCart createFilledCart() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("123", "Product A", 10.99));
        cart.addItem(new Item("456", "Product B", 24.99));
        return cart;
    }


}
