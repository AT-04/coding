package org.fundacionjala.coding.abel;

/**
 * Class to get the sequence of a number.
 */
public final class Sequence {

    private static final int TWENTY_FIVE = 25;

    /**
     * Private Constructor.
     */
    private Sequence() {

    }

    /**
     * This method calculates the Score of the Sequence.
     *
     * @param n long.
     * @return long.
     */
    public static long getScore(final long n) {
        return TWENTY_FIVE * (long) (Math.pow(n, 2) + n);
    }
}
