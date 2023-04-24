package com.demo.cleancode.examples.util.repository;

import com.demo.cleancode.examples.util.model.Employee;
import com.demo.cleancode.examples.util.model.Manager;

import java.util.Arrays;
import java.util.List;

public class ManagerRepository {

    public Manager findManagerId(int id) {
        return new Manager(id);
    }

    public List<Manager> findAll() {
        return Arrays.asList(new Manager(1), new Manager(2), new Manager(3));
    }
}
