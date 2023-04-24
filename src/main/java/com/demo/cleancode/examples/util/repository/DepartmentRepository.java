package com.demo.cleancode.examples.util.repository;

import com.demo.cleancode.examples.util.model.Department;

public class DepartmentRepository {

    public Department findDepartmentById(int id) {
        return new Department(id);
    }
}
