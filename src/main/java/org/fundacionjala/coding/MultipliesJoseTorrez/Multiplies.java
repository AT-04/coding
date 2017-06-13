package org.fundacionjala.coding.MultipliesJoseTorrez;

import java.util.stream.IntStream;

/**
 * Created by JoseTorrez on 6/12/2017.
 */
public class Multiplies {

    /**
     * Constructor.
     */
    public Multiplies() {
    }

    public static int solutionMultiplies(int number) {
        int sum = 0;
        int i = 0;
        while (i < number) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
            i++;
        }
        return sum;
    }
}
