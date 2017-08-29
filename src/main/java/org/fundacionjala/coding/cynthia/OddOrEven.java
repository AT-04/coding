package org.fundacionjala.coding.cynthia;

import static java.util.Arrays.stream;


/**
 * Given an array of numbers, determine whether the sum
 * of all of the numbers is odd or even.
 * Give your answer in string format as 'odd' or 'even'
 * If the input array is empty consider it as: [0] (array with a zero).
 * Example:
 * determineOddOrEven([0]) returns "even"
 * determineOddOrEven([2, 5, 34, 6]) returns "odd"
 * determineOddOrEven([0, -1, -5]) returns "even"
 */
public class OddOrEven {

    /**
     * the method that determine if is odd or even.
     *
     * @param array with the numbers to sum.
     * @return the respective value (even or odd).
     */
    public String determineOddOrEven(int[] array) {
        return stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}

