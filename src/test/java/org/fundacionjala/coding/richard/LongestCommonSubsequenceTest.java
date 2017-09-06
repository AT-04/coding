package org.fundacionjala.coding.richard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
public class LongestCommonSubsequenceTest {

    /**
     *
     */
    @Test
    public void exampleTests() {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();

        assertEquals("acf", lcs.solution("acf", "abcdef"));
        assertEquals("", lcs.solution("a", "b"));
        assertEquals("abc", lcs.solution("abcdef", "abc"));
        assertEquals("abc", lcs.solution("abc", "abcdef"));
        assertEquals("1234", lcs.solution("1234", "3412"));
        assertEquals("a", lcs.solution("abdcdwfghi", "a"));
        assertEquals("a", lcs.solution("a", "ac"));
        assertEquals("abc", lcs.solution("abcdef", "abc"));
        assertEquals("acf", lcs.solution("abcdef", "acf"));
        assertEquals("12356", lcs.solution("123456789", "132535365"));
    }
}
