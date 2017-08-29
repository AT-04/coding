package org.fundacionjala.coding.cynthia;

import static java.util.Arrays.stream;

/**
 * Given an array of numbers, determine whether the sum of all of the numbers is odd or even.

 Give your answer in string format as 'odd' or 'even'.

 If the input array is empty consider it as: [0] (array with a zero).

 Example:

 oddOrEven([0]) returns "even"
 oddOrEven([2, 5, 34, 6]) returns "odd"
 oddOrEven([0, -1, -5]) returns "even"

 Have fun!
 .
 */
public class DetermineOddOrEven {
    public static String oddOrEven(int[] array) {
        return stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}

/**
 * import static java.util.Arrays.stream;

 class Codewars {
 static String oddOrEven(final int[] array) {
 return stream(array).sum() % 2 == 0 ? "even" : "odd";
 }
 }

 ====================================

 import java.util.stream.*;

 public class Codewars {
 public static String oddOrEven(int[] array) {
 return (IntStream.of(array).sum() & 1) == 1 ? "odd" : "even";
 }
 }
 **/