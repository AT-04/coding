package org.fundacionjala.coding.cynthia;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Cynthia on 9/5/2017.
 */
public class MostFrequentTest {
   private MostFrequent most;

    /**
     *
     */
    @Before
    public void setUp() {
        most = new MostFrequent();
    }

    /**
     *
     */
    @Test
    public void basicTests() {
        String msg = "Should work with example test cases";
        assertEquals(msg, 2, most.mostFrequentItemCount(new int[]{3, -1, -1}));
        assertEquals(msg, 5, most.mostFrequentItemCount(new int[]{3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3}));
    }

    /**
     *
     */
    @Test
    public void edgeTests() {
        assertEquals("Should work for empty arrays", 0,
                most.mostFrequentItemCount(new int[0]));
        assertEquals("Should work for 1-element arrays", 1,
                most.mostFrequentItemCount(new int[]{9}));
        assertEquals("Should work with multiple most frequent items, e.g. nine 7's and nine 1's", 3,
                most.mostFrequentItemCount(new int[]{7, 1, 7, 1, 7, 1}));
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
                    mostFrequentAns(testArr), most.mostFrequentItemCount(testArr));
        }
    }

    /**
     * @param arr array.
     * @return the result.
     */
    private String arrToString(int[] arr) {
        StringBuilder retStr = new StringBuilder("{ ");
        for (int i : arr) {
            retStr.append(String.format("%s, ", i));
        }        retStr.append(" }");
        return retStr.toString();
    }

    /**
     * @param collection array.
     * @return the result.
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
