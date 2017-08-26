package org.fundacionjala.coding.marcos;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Marcos Lara on 6/6/2017.
 */

public class AveragesOfNumbersTest {

    /**
     * Basic Test for calculate de averages of array of numbers.
     */
    @Test
    public void basicTests() {
        assertEquals(Arrays.toString(new double[]{2, 2, 2, 2, 2}),
                Arrays.toString(AveragesOfNumbers.averages(new int[]{2, 2, 2, 2, 2, 2})));
        assertEquals(Arrays.toString(new double[]{0, 0, 0, 0}),
                Arrays.toString(AveragesOfNumbers.averages(new int[]{2, -2, 2, -2, 2})));
        assertEquals(Arrays.toString(new double[]{2, 4, 3, -4.5}),
                Arrays.toString(AveragesOfNumbers.averages(new int[]{1, 3, 5, 1, -10})));
    }

    /**
     * Basic Test for null and empty arrays of numbers.
     */
    @Test
    public void nullEmptyTests() {
        assertEquals("input 'null' should return an empty array",
                0, AveragesOfNumbers.averages(null).length);
        assertEquals("Empty array as input should return an empty array",
                0, AveragesOfNumbers.averages(new int[0]).length);
        assertEquals("Array with only one value as input should return an empty array",
                0, AveragesOfNumbers.averages(new int[]{2}).length);
    }
}
