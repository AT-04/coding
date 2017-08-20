package org.fundacionjala.coding.richard;

/**
 * Created by Richard on 8/19/2017.
 * <p>
 * You are given an array (which will have a length of at least 3, but could be very large) containing integers.
 * The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single
 * integer N. Write a method that takes the array as an argument and returns N.
 * For example:
 * [2, 4, 0, 100, 4, 11, 2602, 36]
 * Should return: 11
 * [160, 3, 1719, 19, 11, 13, -21]
 * Should return: 160
 */
public class FindOutlier {

    /**
     * This method is a private constructor.
     */
    public FindOutlier() {
    }

    /**
     * @param outlier is a array of int numbers.
     * @return outlier number.
     */
    int find(int[] outlier) {
        int pairResult = 0;
        int oddResult = 0;
        int countPairNumbers = 0;
        int countOddNumbers = 0;
        for (int anOutlier : outlier) {
            if (anOutlier % 2 == 0) {
                countPairNumbers++;
                pairResult = anOutlier;
            } else {
                countOddNumbers++;
                oddResult = anOutlier;
            }
        }
        return (countPairNumbers > countOddNumbers) ? oddResult : pairResult;
    }
}
