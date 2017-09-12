package org.fundacionjala.coding.marcos;

import java.util.stream.IntStream;

/**
 * Created by Marcos.
 * <p>
 * Professor Chambouliard hast just discovered a new type of magnet material.
 * He put particles of this material in a box made of small boxes arranged
 * in K rows and N columns as a kind of 2D matrix K x N where K and N are positive integers.
 */

public final class Magnets {

    public static final int ONE = 1;
    public static final int TWO = 2;

    /**
     * Private constructor for the Magnets utility class.
     */
    private Magnets() {

    }

    /**
     * This method calculates the total force exerted by rows and columns using the
     * kata summation equation.
     *
     * @param maxK max column value.
     * @param maxN max row value.
     * @return the summation result.
     */
    public static double doubles(int maxK, int maxN) {
        return IntStream.rangeClosed(1, maxK).mapToDouble(k -> calculateForce(k, maxN)).sum();
    }

    /**
     * This method calculates the total force exerted by a row using the Kata
     * summation equation.
     *
     * @param k    fixed column value.
     * @param maxN max row value.
     * @return the summation result.
     */
    private static double calculateForce(int k, int maxN) {
        return IntStream.rangeClosed(ONE, maxN).mapToDouble(n -> ONE / (k * Math.pow(n + ONE, TWO * k))).sum();
    }
}
