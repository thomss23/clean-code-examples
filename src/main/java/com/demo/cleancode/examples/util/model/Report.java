package com.demo.cleancode.examples.util.model;

import lombok.Data;

import java.util.List;

@Data
public class Report {
    private String title;
    private List<String> sections;

    public Report(String title, List<String> sections) {
        this.title = title;
        this.sections = sections;
    }

}
