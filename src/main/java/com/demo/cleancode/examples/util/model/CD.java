package com.demo.cleancode.examples.util.model;

import lombok.Data;

@Data
public class CD {
    private String title;
    private String author;
    private int numberOfTracks;
    private int durationInMinutes;

    public CD() {
    }

    public CD(String title, String author, int numberOfTracks, int durationInMinutes) {
        this.title = title;
        this.author = author;
        this.numberOfTracks = numberOfTracks;
        this.durationInMinutes = durationInMinutes;
    }

}