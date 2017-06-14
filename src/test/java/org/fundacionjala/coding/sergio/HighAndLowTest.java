package org.fundacionjala.coding.sergio;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by SergioNavarro on 6/12/2017.
 */
public class HighAndLowTest {
    /**
     *
     */
    @Test
    public void someTest() {
        assertEquals("542 -214", HighAndLow.resolve("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"));
    }

    /**
     *
     */
    @Test
    public void plusMinusTest() {
        assertEquals("1 -1", HighAndLow.resolve("1 -1"));
    }

    /**
     *
     */
    @Test
    public void plusPlusTest() {
        assertEquals("1 1", HighAndLow.resolve("1 1"));
    }

    /**
     *
     */
    @Test
    public void minusMinusTest() {
        assertEquals("-1 -1", HighAndLow.resolve("-1 -1"));
    }

    /**
     *
     */
    @Test
    public void plusMinusZeroTest() {
        assertEquals("1 -1", HighAndLow.resolve("1 -1 0"));
    }

    /**
     *
     */
    @Test
    public void plusPlusZeroTest() {
        assertEquals("1 0", HighAndLow.resolve("1 1 0"));
    }

    /**
     *
     */
    @Test
    public void minusMinusZeroTest() {
        assertEquals("0 -1", HighAndLow.resolve("-1 -1 0"));
    }

    /**
     *
     */
    @Test
    public void singleTest() {
        assertEquals("42 42", HighAndLow.resolve("42"));
    }


}
