package org.fundacionjala.coding.marcos;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Marcos.
 * <p>
 * Write a program to find count of the most frequent item of an array.
 */
public class FrequentTest {

    /**
     * Basic numbers arrays test.
     */
    @Test
    public void basicTests() {
        String msg = "Should work with example test cases";
        assertEquals(msg, 2,
                Frequent.mostFrequentItemCount(new int[]{3, -1, -1}));
        assertEquals(msg, 5,
                Frequent.mostFrequentItemCount(new int[]{3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3}));
    }

    /**
     * Edge numbers arrays test.
     */
    @Test
    public void edgeTests() {
        assertEquals("Should work for empty arrays", 0,
                Frequent.mostFrequentItemCount(new int[0]));
        assertEquals("Should work for 1-element arrays", 1,
                Frequent.mostFrequentItemCount(new int[]{9}));
        assertEquals("Should work with multiple most frequent items, e.g. nine 7's and nine 1's", 3,
                Frequent.mostFrequentItemCount(new int[]{7, 1, 7, 1, 7, 1}));
    }

    /**
     * Random number array tests.
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
                    Frequent.mostFrequentItemCount(testArr));
        }
    }

    /**
     * Array to String.
     *
     * @param arr numbers array.
     * @return the string representation.
     */
    private String arrToString(int[] arr) {
        //String retStr = "{ ";
        StringBuilder stringBuilder = new StringBuilder("{ ");
        for (int i : arr) {
            //retStr += i + ", ";
            stringBuilder.append(i + ", ");
        }
        return (stringBuilder.toString().substring(0, stringBuilder.length() - 2)) + " }";
    }

    /**
     * Most frecuent Answer.
     *
     * @param collection numbers collection.
     * @return the most frequent answer.
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
