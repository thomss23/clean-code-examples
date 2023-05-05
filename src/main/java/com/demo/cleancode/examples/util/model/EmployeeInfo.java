package com.demo.cleancode.examples.util.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeInfo {

    private String name;
    private String type;
    private int age;
    private String color;
    private String address;
}
