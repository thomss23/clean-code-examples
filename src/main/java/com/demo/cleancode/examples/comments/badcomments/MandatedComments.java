package com.demo.cleancode.examples.comments.badcomments;

import com.demo.cleancode.examples.util.model.CD;

import java.util.List;

/*
It is just plain silly to have a rule that says that every function must have a javadoc, or
every variable must have a comment.

This clutter adds nothing and serves only to obfuscate the code and create the
potential for lies and misdirection.
 */
public class MandatedComments {
    private List<CD> cdList;
    /**
     *
     * @param title The title of the CD
     * @param author The author of the CD
     * @param tracks The number of tracks on the CD
     * @param durationInMinutes The duration of the CD in minutes
     */
    public void addCD(String title, String author,
                      int tracks, int durationInMinutes) {
        CD cd = new CD();
        cd.setTitle(title);
        cd.setAuthor(author);
        cd.setNumberOfTracks(tracks);
        cd.setDurationInMinutes(durationInMinutes);
        cdList.add(cd);
    }
}
