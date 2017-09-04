package org.fundacionjala.coding.ovidio;

import static java.util.Arrays.stream;

/**
 * Created by Simon on 27/08/2017.
 * Max Diff - Easy
 * You must implement a function maxDiff that return the difference between
 * the biggest and the smallest value in a list(lst) received as parameter.
 * <p>
 * The list(lst) contains integers, that means it may contain some negative numbers.
 * <p>
 * If the list is empty or contains a single element, return 0.
 * <p>
 * The list(lst) is not sorted.
 */
public class MaxDiff {

    /**
     * Max diff.
     *
     * @param lst int[].
     * @return int.
     */
    public int maxDiff(int[] lst) {
        if (lst.length == 0) {
            return 0;
        }
        return stream(lst).max().getAsInt() - stream(lst).min().getAsInt();
    }
}
