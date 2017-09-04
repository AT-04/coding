package org.fundacionjala.coding.cynthia;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by Administrator on 8/23/2017.
 */
public class OddOrEvenTest {

    /**
     * Tests.
     */
    @Test
    public void exampleTest() {
        OddOrEven oddEven = new OddOrEven();
        assertEquals("odd", oddEven.determineOddOrEven(new int[] {2, 5, 34, 6}));
        assertEquals("even", oddEven.determineOddOrEven(new int[] {0}));
        assertEquals("even", oddEven.determineOddOrEven(new int[] {0, -1, -5}));
        assertEquals("odd", oddEven.determineOddOrEven(new int[] {10, 10, 10, 10, 10, 10, 1}));
        assertEquals("even", oddEven.determineOddOrEven(new int[] {1, 1, 1, 1, 1, 1}));
        assertEquals("odd", oddEven.determineOddOrEven(new int[] {25}));
    }
}
