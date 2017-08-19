package org.fundacionjala.coding.cynthia;

/**
 * Created by Cynthia on 8/18/2017.
 */
public class Sequence {

    private static final long TWENTY_FIVE = 25;

    /**
     * this is the constructor.
     */

    /**
     * @param num of the user.
     * @return result.
     */
    static long getScore(long num) {
        return (TWENTY_FIVE * (1 + num)) * num;
    }
}

