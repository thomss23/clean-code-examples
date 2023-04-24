package com.demo.cleancode.examples.comments.goodcomments;

import java.util.regex.Pattern;

public abstract class InformativeComments {

    // Returns an instance of the Responder being tested.
    protected abstract Responder responderInstance();

    // format matched kk:mm:ss EEE, MMM dd, yyyy
    Pattern timeMatcher = Pattern.compile(
            "\\d*:\\d*:\\d* \\w*, \\w* \\d*, \\d*");
}

class Responder {

}
