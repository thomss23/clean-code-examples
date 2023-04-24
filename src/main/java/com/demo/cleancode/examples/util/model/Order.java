package com.demo.cleancode.examples.util.model;

import lombok.Data;

@Data
public class Order {
    private String orderId;
    private boolean isInternational;

    public boolean isInternational() {
        return isInternational;
    }
}