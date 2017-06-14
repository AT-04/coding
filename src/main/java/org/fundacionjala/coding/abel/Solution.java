package org.fundacionjala.coding.abel;

import java.util.stream.IntStream;

/**
 * Created by AbelBarrientos on 6/12/2017.
 */
public final class Solution {

    /**
     * Default Constructor.
     */
    private Solution() {

    }

    /**
     * Calculate Multiples of Three and Five.
     * @param number Integer.
     * @return Integer.
     */
    public static int solution(int number) {

        return IntStream.range(0, number)
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .sum();
    }
}
