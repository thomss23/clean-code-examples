package com.demo.cleancode.examples.names;


/**
 * Non-descriptive names for methods and variables used
 * This requires a lot of mental mapping for each single-letter variable name
 **/
public class DescriptiveNamesBad {

    private final int[] l = new int[21];

    public int x() {
        int q = 0;
        int z = 0;
        for (int kk = 0; kk < 10; kk++) {
            if (l[z] == 10) {
                q += 10 + (l[z + 1] + l[z + 2]);
                z += 1;
            } else if (l[z] + l[z + 1] == 10) {
                q += 10 + l[z + 2];
                z += 2;
            } else {
                q += l[z] + l[z + 1];
                z += 2;
            }
        }
        return q;
    }
}
