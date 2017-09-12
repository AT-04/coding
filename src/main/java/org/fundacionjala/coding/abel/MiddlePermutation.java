package org.fundacionjala.coding.abel;

import java.util.Arrays;

/**
 * You are given a string s. Every letter in s appears once.
 * Consider all strings formed by rearranging the letters in s. After ordering these strings in dictionary order,
 * return the middle term. (If the sequence has a even length n, define its middle term to be the (n/2)th term.)
 * Example
 * For s = "abc", the result should be "bac".
 * The permutations in order are:
 * "abc", "acb", "bac", "bca", "cab", "cba"
 * So, The middle term is "bac".
 * Input/Output
 * [input] string s
 * unique letters (2 < length <= 26)
 * [output] a string
 * middle permutation.
 */
public final class MiddlePermutation {

    /**
     * Private Constructor.
     */
    private MiddlePermutation() {

    }

    /**
     * Returns the Permutation located at mid position of all permutations available in the string.
     *
     * @param string String.
     * @return Permutation located at mid position.
     */
    public static String findMidPerm(String string) {
        int length = string.length();
        char[] currentCharArray = string.toCharArray();
        Arrays.sort(currentCharArray);
        char[] resultCharArray = new char[currentCharArray.length];
        int half = length / 2;
        int last = length - 1;
        for (int i = last, j = 0; j < half - 1; i--, j++) {
            resultCharArray[i] = currentCharArray[j];
        }
        if (length % 2 != 0) {
            resultCharArray[0] = currentCharArray[half];
            resultCharArray[1] = currentCharArray[half - 1];
            for (int i = last, j = 2; i > half; i--, j++) {
                resultCharArray[j] = currentCharArray[i];
            }
        } else {
            resultCharArray[0] = currentCharArray[half - 1];
            resultCharArray[half] = currentCharArray[half];
            for (int i = last, j = 1; i > half; i--, j++) {
                resultCharArray[j] = currentCharArray[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : resultCharArray) {
            sb.append(c);
        }
        return sb.toString();
    }

}
