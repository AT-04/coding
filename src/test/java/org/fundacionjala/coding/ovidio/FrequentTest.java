package org.fundacionjala.coding.ovidio;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 9/5/2017.
 */
public class FrequentTest {
    private Frequent frecuent;

    /**
     *
     */
    @Before
    public void setUp() {
        frecuent = new Frequent();
    }

    /**
     *
     */

    /**
     *
     */
    @Test
    public void basicTests() {
        String msg = "Should work with example test cases";
        assertEquals(msg, 2, frecuent.mostFrequentItemCount(new int[]{3, -1, -1}));
        assertEquals(msg, 5, frecuent.mostFrequentItemCount(new int[]{3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3}));
    }

    /**
     *
     */
    @Test
    public void edgeTests() {
        String message1 = "Should work for empty arrays";
        String message2 = "Should work for 1-element arrays";
        String message3 = "Should work with multiple most frequent items, e.g. nine 7's and nine 1's";
        assertEquals(message1, 0, frecuent.mostFrequentItemCount(new int[0]));
        assertEquals(message2, 1, frecuent.mostFrequentItemCount(new int[]{9}));
        assertEquals(message3, 3, frecuent.mostFrequentItemCount(new int[]{7, 1, 7, 1, 7, 1}));
    }

    /**
     *
     */
    @Test
    public void randomTests() {
        Random randGen = new Random();
        System.out.println("Testing 40 random arrays...");
        for (int i = 0; i < 40; i++) {
            int[] testArr = new int[randGen.nextInt(30)];
            for (int e = 0; e < testArr.length; e++) {
                testArr[e] = randGen.nextInt(30) - 15;
            }
            assertEquals("Should work with " + arrToString(testArr),
                    mostFrequentAns(testArr), frecuent.mostFrequentItemCount(testArr));
        }
    }

    /**
     * Array To String.
     *
     * @param arr array.
     * @return string.
     */
    private String arrToString(int[] arr) {
        StringBuilder retStr = new StringBuilder("{ ");
        for (int i : arr) {
            //retStr += i + ", ";
            retStr.append(i).append(", ");
        }
        return (retStr.substring(0, retStr.length() - 2)) + " }";
    }

    /**
     * Most Frequent Ans.
     *
     * @param collection collection.
     * @return int.
     */
    private int mostFrequentAns(int[] collection) {
        int max = 0;
        int currMax = 0;
        int currNum = 0;
        Arrays.sort(collection);
        for (int i = 0; i < collection.length; i++) {
            if (currNum != collection[i]) {
                if (currMax > max) {
                    max = currMax;
                }
                currMax = 1;
                currNum = collection[i];
            } else {
                currMax++;
            }
        }
        return (currMax > max ? currMax : max);
    }
}

