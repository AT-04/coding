package org.fundacionjala.coding.richardseverich;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by Richard on 6/7/2017.
 */
public class AveragesOfNumbersTest {

    private AveragesOfNumbers kata;

    /**
     *
     */
    @Before
    public void setUp() {
        kata = new AveragesOfNumbers();
    }

    /**
     *
     */
    @Test
    public void basicTests() {
        double[] expectedResult = new double[]{2, 2, 2, 2};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(kata.averages(new int[]{2, 2, 2, 2, 2})));
        expectedResult = new double[]{0, 0, 0, 0};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(kata.averages(new int[]{2, -2, 2, -2, 2})));
        expectedResult = new double[]{2, 4, 3, -4.5};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(kata.averages(new int[]{1, 3, 5, 1, -10})));

    }

    /**
     *
     */
    @Test
    public void nullEmptyTests() {
        assertEquals("input 'null' should return an empty array", 0, kata.averages(null).length);
        assertEquals("Empty array as input should return an empty array", 0, kata.averages(new int[0]).length);
        assertEquals("Array with only one value as input should return an empty array",
                0, kata.averages(new int[]{2}).length);
    }

}
