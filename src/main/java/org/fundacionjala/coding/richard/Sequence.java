package org.fundacionjala.coding.richard;

/**
 * Created by RichardSeverich on 8/18/2017.
 */
public final class Sequence {

    /**
     * This method is private constructor.
     */
    private Sequence() {
    }

    /**
     * @param num is the number to convert.
     * @return the sequence number.
     */
    public static long getScore(long num) {
        long result = 0;
        while (num > 0) {
            result += num;
            num -= 1;
        }
        return result * 50;
    }
}
