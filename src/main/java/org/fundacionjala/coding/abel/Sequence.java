package org.fundacionjala.coding.abel;

/**
 * Class to get the sequence of a number.
 */
public final class Sequence {

    private static final int FIFTY = 50;

    /**
     * Private Constructor.
     */
    private Sequence() {

    }

    /**
     * This method calculates the Score of the Sequence.
     * @param n long.
     * @return long.
     */
    public static long getScore(final long n) {
        return n <= 1 ? FIFTY : n * FIFTY + getScore(n - 1);
    }
}
