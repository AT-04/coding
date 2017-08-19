package org.fundacionjala.coding.marcoslara;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Marcos on 12-06-2017.
 */
public class HighestAndLowestTest {
    /**
     * Main test with thirteen values.
     */
    @Test
    public void someTest() {
        assertThat(HighestAndLowest.highAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"), is("542 -214"));
    }

    /**
     * Plus minus test with two values.
     */
    @Test
    public void plusMinusTest() {
        assertThat(HighestAndLowest.highAndLow("1 -1"), is("1 -1"));
    }

    /**
     * Plus plus test with two values.
     */
    @Test
    public void plusPlusTest() {
        assertThat(HighestAndLowest.highAndLow("1 1"), is("1 1"));
    }

    /**
     * Minus minus test with two values.
     */
    @Test
    public void minusMinusTest() {
        assertThat(HighestAndLowest.highAndLow("-1 -1"), is("-1 -1"));
    }

    /**
     * Plus minus test with three values.
     */
    @Test
    public void plusMinusZeroTest() {
        assertThat(HighestAndLowest.highAndLow("1 -1 0"), is("1 -1"));
    }

    /**
     * Plus plus test with three values.
     */
    @Test
    public void plusPlusZeroTest() {
        assertThat(HighestAndLowest.highAndLow("1 1 0"), is("1 0"));
    }

    /**
     * Minus and minus test with two values.
     */
    @Test
    public void minusMinusZeroTest() {
        assertThat(HighestAndLowest.highAndLow("-1 -1 0"), is("0 -1"));
    }

    /**
     * Single test with one value.
     */
    @Test
    public void singleTest() {
        assertThat(HighestAndLowest.highAndLow("42"), is("42 42"));
    }
}
