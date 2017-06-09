package org.fundacionjala.coding.cynthia;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by CynthiaTerrazas on 6/6/2017.
 */
public class AveragesNumbersTest {
    /**
     * this is the first test cases for calculate the averages.
     */
    @Test
    public void basicTests() {
        assertEquals(Arrays.toString(new double[]{2, 2, 2, 2}),
                Arrays.toString(AveragesNumbers.arrayAverage(new int[]{2, 2, 2, 2, 2})));
        assertEquals(Arrays.toString(new double[]{0, 0, 0, 0}),
                Arrays.toString(AveragesNumbers.arrayAverage(new int[]{2, -2, 2, -2, 2})));
        assertEquals(Arrays.toString(new double[]{2, 4, 3, -4.5}),
                Arrays.toString(AveragesNumbers.arrayAverage(new int[]{1, 3, 5, 1, -10})));
    }

    /**
     * this test is for the empty, null, one element that are corrects for the Average.
     */
    @Test
    public void nullEmptyTests() {
        assertEquals(0, AveragesNumbers.arrayAverage(null).length);
        assertEquals(0, AveragesNumbers.arrayAverage(new int[0]).length);
        assertEquals(0, AveragesNumbers.arrayAverage(new int[]{2}).length);
    }
}
