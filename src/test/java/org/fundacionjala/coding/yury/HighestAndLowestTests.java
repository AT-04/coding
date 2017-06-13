package org.fundacionjala.coding.yury;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by YuryOrtuno on 6/12/2017.
 */
public class HighestAndLowestTests {
    /**
     * Test one.
     */
    @Test
    public void someTest() {
        assertThat(HighestAndLowest.highAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"), is("542 -214"));
    }

    /**
     * Test two.
     */
    @Test
    public void plusMinusTest() {
        assertThat(HighestAndLowest.highAndLow("1 -1"), is("1 -1"));
    }

    /**
     * Test three.
     */
    @Test
    public void plusPlusTest() {
        assertThat(HighestAndLowest.highAndLow("1 1"), is("1 1"));
    }

    /**
     * Test four.
     */
    @Test
    public void minusMinusTest() {
        assertThat(HighestAndLowest.highAndLow("-1 -1"), is("-1 -1"));
    }

    /**
     * Test five.
     */
    @Test
    public void plusMinusZeroTest() {
        assertThat(HighestAndLowest.highAndLow("1 -1 0"), is("1 -1"));
    }

    /**
     * Test six.
     */
    @Test
    public void plusPlusZeroTest() {
        assertThat(HighestAndLowest.highAndLow("1 1 0"), is("1 0"));
    }

    /**
     * Test seven.
     */
    @Test
    public void minusMinusZeroTest() {
        assertThat(HighestAndLowest.highAndLow("-1 -1 0"), is("0 -1"));
    }

    /**
     * Test eight.
     */
    @Test
    public void singleTest() {
        assertThat(HighestAndLowest.highAndLow("42"), is("42 42"));
    }
}
