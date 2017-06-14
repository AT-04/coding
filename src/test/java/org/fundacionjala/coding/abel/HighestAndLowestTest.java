package org.fundacionjala.coding.abel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AbelBarrientos on 6/12/2017.
 */
public class HighestAndLowestTest {

    /**
     *
     */
    @Test
    public void someTest() {
        assertEquals(HighestAndLowest.highAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"), "542 -214");
    }

    /**
     *
     */
    @Test
    public void plusMinusTest() {
        assertEquals(HighestAndLowest.highAndLow("1 -1"), ("1 -1"));
    }

    /**
     *
     */
    @Test
    public void plusPlusTest() {
        assertEquals(HighestAndLowest.highAndLow("1 1"), ("1 1"));
    }

    /**
     *
     */
    @Test
    public void minusMinusTest() {
        assertEquals(HighestAndLowest.highAndLow("-1 -1"), ("-1 -1"));
    }

    /**
     *
     */
    @Test
    public void plusMinusZeroTest() {
        assertEquals(HighestAndLowest.highAndLow("1 -1 0"), ("1 -1"));
    }

    /**
     *
     */
    @Test
    public void plusPlusZeroTest() {
        assertEquals(HighestAndLowest.highAndLow("1 1 0"), ("1 0"));
    }

    /**
     *
     */
    @Test
    public void minusMinusZeroTest() {
        assertEquals(HighestAndLowest.highAndLow("-1 -1 0"), ("0 -1"));
    }

    /**
     *
     */
    @Test
    public void singleTest() {
        assertEquals(HighestAndLowest.highAndLow("42"), ("42 42"));
    }
}
