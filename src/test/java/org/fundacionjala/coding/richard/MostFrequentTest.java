package org.fundacionjala.coding.richard;

import java.util.Arrays;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 9/5/2017.
 */
public class MostFrequentTest {

    private MostFrequent mostFrequent;

    /**
     *
     */
    @Before
    public void setUp() {
        mostFrequent = new MostFrequent();
    }

    /**
     *
     */
    @Test
    public void basicTests() {
        String msg = "Should work with example test cases";
        assertEquals(msg, 2,
                mostFrequent.mostFrequentItemCount(new int[]{3, -1, -1}));
        assertEquals(msg, 5,
                mostFrequent.mostFrequentItemCount(new int[]{3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3}));
    }

    /**
     *
     */
    @Test
    public void edgeTests() {
        assertEquals("Should work for empty arrays", 0,
                mostFrequent.mostFrequentItemCount(new int[0]));
        assertEquals("Should work for 1-element arrays", 1,
                mostFrequent.mostFrequentItemCount(new int[]{9}));
        assertEquals("Should work with multiple most frequent items, e.g. nine 7's and nine 1's", 3,
                mostFrequent.mostFrequentItemCount(new int[]{7, 1, 7, 1, 7, 1}));
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
            assertEquals("Should work with " + arrToString(testArr), mostFrequentAns(testArr),
                    mostFrequent.mostFrequentItemCount(testArr));
        }
    }

    /**
     * @param arr contains the array.
     * @return return String.
     */
    private String arrToString(int[] arr) {
        StringBuilder retStr = new StringBuilder("{ ");
        for (int i : arr) {
            retStr.append(i).append(", ");
        }
        return (retStr.substring(0, retStr.length() - 2)) + " }";
    }

    /**
     * @param collection a collection with int numbers.
     * @return the max number.
     */
    private int mostFrequentAns(int[] collection) {
        int max = 0;
        int currMax = 0;
        int currNum = 0;
        Arrays.sort(collection);
        for (int aCollection : collection) {
            if (currNum != aCollection) {
                if (currMax > max) {
                    max = currMax;
                }
                currMax = 1;
                currNum = aCollection;
            } else {
                currMax++;
            }
        }
        return (currMax > max ? currMax : max);
    }
}
