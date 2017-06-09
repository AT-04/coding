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
        AveragesOfNumbers kata = new AveragesOfNumbers();
        assertEquals(Arrays.toString(new double[]{2, 2, 2, 2}),
                Arrays.toString(kata.averages(new int[]{2, 2, 2, 2, 2})));
    }

    /**
     *
     */
    @Test
    public void basicTests2() {
        AveragesOfNumbers kata = new AveragesOfNumbers();
        assertEquals(Arrays.toString(new double[]{0, 0, 0, 0}),
                Arrays.toString(kata.averages(new int[]{2, -2, 2, -2, 2})));
    }

    /**
     *
     */
    @Test
    public void basicTests3() {
        AveragesOfNumbers kata = new AveragesOfNumbers();
        assertEquals(Arrays.toString(new double[]{2, 4, 3, -4.5}),
                Arrays.toString(kata.averages(new int[]{1, 3, 5, 1, -10})));
    }

    /**
     *
     */
    @Test
    public void nullEmptyTests1() {
        AveragesOfNumbers kata = new AveragesOfNumbers();
        assertEquals("input 'null' should return an empty array", 0, kata.averages(null).length);
    }

    /**
     *
     */
    @Test
    public void nullEmptyTests2() {
        AveragesOfNumbers kata = new AveragesOfNumbers();
        assertEquals("Empty array as input should return an empty array", 0, kata.averages(new int[0]).length);
    }

    /**
     *
     */
    @Test
    public void nullEmptyTests3() {
        AveragesOfNumbers kata = new AveragesOfNumbers();
        assertEquals("Array with only one value as input should return an empty array", 0,
                kata.averages(new int[]{2}).length);
    }
}
