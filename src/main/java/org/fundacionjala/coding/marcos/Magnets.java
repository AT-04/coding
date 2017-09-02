package org.fundacionjala.coding.marcos;

import java.util.stream.IntStream;

/**
 * Created by Marcos.
 */

public final class Magnets {

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
        return IntStream.rangeClosed(1, maxN).mapToDouble(n -> 1 / (k * Math.pow(n + 1, 2 * k))).sum();
    }
}
