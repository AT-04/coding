package org.fundacionjala.coding.ovidio;

import static java.util.Arrays.stream;

/**
 * Sum of Digits / Digital Root.
 * In this kata, you must create a digital root function.
 * <p>
 * A digital root is the recursive sum of all the digits in a number.
 * Given n, take the sum of the digits of n. If that value has two digits,
 * continue reducing in this way until a single-digit number is produced.
 * This is only applicable to the natural numbers.
 * <p>
 * Here's how it works (Ruby example given):
 */
public class DRoot {
    /**
     * Digital Root.
     * @param n number.
     * @return root.
     */
    public  int digitalRoot(int n) {
        int sum = stream(String.valueOf(n).split(""))
                .mapToInt(Integer::parseInt)
                .sum();
        return sum > 10 ? digitalRoot(sum) : sum;
    }
}

