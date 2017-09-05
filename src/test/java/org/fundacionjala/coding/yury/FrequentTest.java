package org.fundacionjala.coding.yury;

import java.util.Arrays;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 9/5/2017.
 */
public class FrequentTest {
    private Frequent frequent;

    /**
     * This before.
     */
    @Before
    public void setUp() {
        frequent = new Frequent();
    }

    /**
     * Test.
     */
    @Test
    public void basicTests() {
        assertEquals(2, frequent.mostFrequentItemCount(new int[]{3, -1, -1}));
        assertEquals(5, frequent.mostFrequentItemCount(new int[]{3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3}));
    }

    /**
     * Test.
     */
    @Test
    public void edgeTests() {
        assertEquals(0, frequent.mostFrequentItemCount(new int[0]));
        assertEquals(1, frequent.mostFrequentItemCount(new int[]{9}));
        assertEquals(3, frequent.mostFrequentItemCount(new int[]{7, 1, 7, 1, 7, 1}));
    }

    /**
     * Test.
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
            assertEquals(mostFrequentAns(testArr), frequent.mostFrequentItemCount(testArr));
        }
    }

    /**
     * This method more frequent.
     *
     * @param collection all value.
     * @return maxim.
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
