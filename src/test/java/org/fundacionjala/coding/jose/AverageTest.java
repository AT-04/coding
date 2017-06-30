package org.fundacionjala.coding.jose;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by JUANJOSE on 08/06/2017.
 */
public class AverageTest {
    /**
     * .
     */
    @Test
    public void basicTests() {
        assertEquals(Arrays.toString(new double[]{2, 2, 2, 2}),
                Arrays.toString(Average.averageNumbers(new int[]{2, 2, 2, 2, 2})));
        assertEquals(Arrays.toString(new double[]{0, 0, 0, 0}),
                Arrays.toString(Average.averageNumbers(new int[]{2, -2, 2, -2, 2})));
        assertEquals(Arrays.toString(new double[]{2, 4, 3, -4.5}),
                Arrays.toString(Average.averageNumbers(new int[]{1, 3, 5, 1, -10})));
    }

    /**
     * .
     */
    @Test
    public void nullEmptyTests() {
        assertEquals(0, Average.averageNumbers(null).length);
        assertEquals(0, Average.averageNumbers(new int[0]).length);
        assertEquals(0, Average.averageNumbers(new int[]{2}).length);
    }
}
