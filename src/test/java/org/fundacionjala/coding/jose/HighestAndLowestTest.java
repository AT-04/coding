package org.fundacionjala.coding.jose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by JoseTorrez on 6/12/2017.
 */
public class HighestAndLowestTest {
    /**
     *
     */
    @Test
    public void someTest() {
        assertEquals("542 -214",
                HighestAndLowest.getHightAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"));
    }

    /**
     *
     */
    @Test
    public void plusMinusTest() {
        assertEquals("1 -1", HighestAndLowest.getHightAndLow("1 -1"));
    }

    /**
     *
     */
    @Test
    public void plusPlusTest() {
        assertEquals("1 1", HighestAndLowest.getHightAndLow("1 1"));
    }

    /**
     *
     */
    @Test
    public void minusMinusTest() {
        assertEquals("-1 -1", HighestAndLowest.getHightAndLow("-1 -1"));
    }

    /**
     *
     */
    @Test
    public void plusMinusZeroTest() {
        assertEquals("1 -1", HighestAndLowest.getHightAndLow("1 -1 0"));
    }

    /**
     *
     */
    @Test
    public void plusPlusZeroTest() {
        assertEquals("1 0", HighestAndLowest.getHightAndLow("1 1 0"));
    }

    /**
     *
     */
    @Test
    public void minusMinusZeroTest() {
        assertEquals("0 -1", HighestAndLowest.getHightAndLow("-1 -1 0"));
    }

    /**
     *
     */
    @Test
    public void singleTest() {
        assertEquals("42 42", HighestAndLowest.getHightAndLow("42"));
    }
}
