package com.demo.cleancode.examples.util.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {

    private final String name;
    private final String age;
    private final String city;
}
