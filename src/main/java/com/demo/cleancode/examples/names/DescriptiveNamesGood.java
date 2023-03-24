package com.demo.cleancode.examples.names;


/**
 * Use descriptive names. use a descriptive name for an intent that can reveal its intention.
 * It will get some time to choose suitable names, but it will save more time than it takes right now.
 **/
public class DescriptiveNamesGood {

    private final int[] rolls = new int[21];

    public int score(int frame) {
        int score = 0;
        int roll = 0;
        for (int frameNumber = 0; frameNumber < frame; frameNumber++) {
            if (isStrike(roll)) {
                score += 10 + nextTwoBallsForStrike(roll);
                roll++;
            } else if (isSpare(roll)) {
                score += 10 + nextBallForSpare(roll);
                roll += 2;
            } else {
                score += ballsInFrame(roll);
                roll += 2;
            }
        }
        return score;
    }

    private boolean isStrike(int roll) {
        return rolls[roll] == 10;
    }

    private int nextTwoBallsForStrike(int roll) {
        return (rolls[roll + 1] + rolls[roll + 2]);
    }

    private boolean isSpare(int roll) {
        return rolls[roll] + rolls[roll + 1] == 10;
    }

    private int nextBallForSpare(int roll) {
        return rolls[roll + 2];
    }

    private int ballsInFrame(int roll) {
        return rolls[roll] + rolls[roll + 1];
    }
}
