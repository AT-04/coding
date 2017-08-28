package org.fundacionjala.coding.sergio;

/**
 * Created by SergioNavarro on 8/18/2017.
 */
final class Sequence {
    /**
     * Default.
     */
    private Sequence() {
    }

    /**
     * @param n given.
     * @return number.
     */
    public static long getScore(final long n) {
        long number = 0;
        int x = 50;
        for (int i = 0; i < n; i++) {
            number = number + x;
            x += 50;
        }
        return number;
    }
}
