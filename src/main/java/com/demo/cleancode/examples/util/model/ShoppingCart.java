package com.demo.cleancode.examples.util.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double getTotalWeight() {
        // Calculate and return total weight of items in the cart
        return 0;
    }


    public double calculateTotalPrice() {
        return 0;
    }

    public double calculateTotalPriceWithDiscount(double v) {
        return 0;
    }
}
