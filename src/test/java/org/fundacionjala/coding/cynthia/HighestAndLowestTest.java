package org.fundacionjala.coding.cynthia;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.fundacionjala.coding.cynthia.HighestAndLowest.calculated;

/**
 * Created by USUARIO on 13/06/2017.
 */
public class HighestAndLowestTest {

    /**
     *
     */
    @Test
    public void theFirstTest() {
        assertEquals("5 1", calculated("1 2 3 4 5"));
    }

    /**
     *
     */
    @Test
    public void theSecondTest() {
        assertEquals("5 -3", calculated("1 2 -3 4 5"));
    }

    /**
     *
     */
    @Test
    public void theTirthTest() {
        assertEquals("9 -5", calculated("1 9 3 4 -5"));
    }

    /**
     *
     */
    @Test
    public void someTest() {
        assertEquals("542 -214", calculated("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"));
    }

    /**
     *
     */
    @Test
    public void plusMinusTest() {
        assertEquals("1 -1", calculated("1 -1"));
    }

    /**
     *
     */
    @Test
    public void plusPlusTest() {
        assertEquals("1 1", calculated("1 1"));
    }

    /**
     *
     */
    @Test
    public void minusMinusTest() {
        assertEquals("-1 -1", calculated("-1 -1"));
    }

    /**
     *
     */
    @Test
    public void plusMinusZeroTest() {
        assertEquals("1 -1", calculated("1 -1 0"));
    }

    /**
     *
     */
    @Test
    public void plusPlusZeroTest() {
        assertEquals("1 0", calculated("1 1 0"));
    }

    /**
     *
     */
    @Test
    public void minusMinusZeroTest() {
        assertEquals("0 -1", calculated("-1 -1 0"));
    }

    /**
     *
     */
    @Test
    public void singleTest() {
        assertEquals("42 42", calculated("42"));
    }

}
