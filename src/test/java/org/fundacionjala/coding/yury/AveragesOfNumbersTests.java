package org.fundacionjala.coding.yury;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


/**
 * Created by YuryOrtuno on 6/6/2017.
 */
public class AveragesOfNumbersTests {

    /**
     *
     */
    @Test
    public void basicTests1() {
        assertEquals(Arrays.toString(new double[]{2, 2, 2, 2}),
                Arrays.toString(AveragesOfNumbers.averages(new int[]{2, 2, 2, 2, 2})));
    }

    /**
     *
     */
    @Test
    public void basicTests2() {
        assertEquals(Arrays.toString(new double[]{0, 0, 0, 0}),
                Arrays.toString(AveragesOfNumbers.averages(new int[]{2, -2, 2, -2, 2})));
    }

    /**
     *
     */
    @Test
    public void basicTests3() {
        assertEquals(Arrays.toString(new double[]{2, 4, 3, -4.5}),
                Arrays.toString(AveragesOfNumbers.averages(new int[]{1, 3, 5, 1, -10})));
    }

    /**
     *
     */
    @Test
    public void nullEmptyTests1() {
        assertEquals("input 'null' should return an empty array", 0,
                AveragesOfNumbers.averages(null).length);
    }

    /**
     *
     */
    @Test
    public void nullEmptyTests2() {
        assertEquals("Empty array as input should return an empty array", 0,
                AveragesOfNumbers.averages(new int[0]).length);
    }

    /**
     *
     */
    @Test
    public void nullEmptyTests3() {
        assertEquals("Array with only one value as input should return an empty array", 0,
                AveragesOfNumbers.averages(new int[]{2}).length);
    }
}
