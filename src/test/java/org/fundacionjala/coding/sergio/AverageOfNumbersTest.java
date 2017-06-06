package org.fundacionjala.coding.sergio;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by SergioNavarro on 6/6/2017.
 */
public class AverageOfNumbersTest {

    @Test
    public void basicTest() {

        assertEquals(Arrays.toString(new double[] { 2, 2, 2, 2 }), Arrays.toString(AverageOfNumbers.averages(new int[] { 2, 2, 2, 2, 2 })));

    }

}