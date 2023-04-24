package com.demo.cleancode.examples.util.model;

import lombok.Data;

import java.util.List;

@Data
public class DataSet {
    private List<Integer> data;

    public DataSet(List<Integer> data) {
        this.data = data;
    }

}
