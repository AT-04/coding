package org.fundacionjala.coding.cynthia;

/**
 * Given the triangle of consecutive odd numbers:
 * <p>
 * 1
 * 3     5
 * 7     9    11
 * 13    15    17    19
 * 21    23    25    27    29
 * ...
 * <p>
 * Calculate the row sums of this triangle from the row index (starting at index 1) e.g.:
 * <p>
 * row_sum_odd_numbers(1); # 1
 * row_sum_odd_numbers(2); # 3 + 5 = 8
 */
public class SumOddNumbers {

    /**
     * @param n integer.
     * @return the sum.
     */
    public int rowSumOddNumbers(int n) {
        return (int) Math.pow(n, 3);
    }
}
