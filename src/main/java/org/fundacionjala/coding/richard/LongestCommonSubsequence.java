package org.fundacionjala.coding.richard;

/**
 * Created by Richard on 9/5/2017.
 * Write a function called LCS that accepts two sequences and returns the longest subsequence common
 * to the passed in sequences.
 * Subsequence
 * A subsequence is different from a substring. The terms of a subsequence need not be consecutive
 * terms of the original sequence.
 * Example subsequence
 * Subsequences of "abc" = "a", "b", "c", "ab", "ac", "bc" and "abc".
 * LCS examples
 * solution.lcs("abcdef", "abc") => returns "abc"
 * solution.lcs("abcdef", "acf") => returns "acf"
 * solution.lcs("132535365", "123456789") => returns "12356"
 */
public class LongestCommonSubsequence {

    /**
     * @param firstCad
     * @param secondCad
     * @return
     */
    public String solution(String firstCad, String secondCad) {
        if (firstCad.contains(secondCad)) {
            return secondCad;
        }
        if (secondCad.contains(firstCad)) {
            return firstCad;
        }
        if (firstCad.length() == 1 && secondCad.length() == 1) {
            return "";
        }
        if (firstCad.length() > 1) {
            return solution(firstCad.substring(1), secondCad);
        } else {
            return solution(firstCad, secondCad.substring(1));
        }
    }

}