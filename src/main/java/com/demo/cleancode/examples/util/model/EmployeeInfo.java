package com.demo.cleancode.examples.util.model;

public class EmployeeInfo {
    private final String name;
    private final String type;
    private final int age;
    private final String color;
    private final String address;

    public EmployeeInfo(String name, String type, int age, String color, String address) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.color = color;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getAddress() {
        return address;
    }
}
