package com.demo.cleancode.examples.util.model;

import lombok.Getter;

@Getter
public class Item {
    private String id;
    private String name;
    private double price;

    public Item(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}
