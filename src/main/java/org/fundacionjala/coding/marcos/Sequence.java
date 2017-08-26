package org.fundacionjala.coding.marcos;

/**
 * Created by Marcos on 18-08-2017.
 * Can you find a pattern in it? If so, then write a function getScore(n)
 * which returns the score for any positive number n:
 * getScore(1); // == 50
 * getScore(2); // == 150
 * getScore(3); // == 300
 */
public final class Sequence {

    /**
     * Private constructor for the Sequence utility class.
     */
    private Sequence() {
    }

    /**
     * This method calculate the score based in the series relation.
     *
     * @param n the score parameter.
     * @return the resulting score.
     */
    public static long getScore(long n) {
        return  25 * (long) (Math.pow(n, 2) + n);
    }
}
