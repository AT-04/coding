package org.fundacionjala.coding.richard;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by RichardSeverich on 6/12/2017.
 */
public class HighLowTest {

    private HighLow kata;

    /**
     *
     */
    @Before
    public void setUp() {
        kata = new HighLow();
    }

    /**
     *
     */
    @Test
    public void someTest() {
        assertThat(kata.highAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"), is("542 -214"));
    }

    /**
     *
     */
    @Test
    public void plusMinusTest() {
        assertThat(kata.highAndLow("1 -1"), is("1 -1"));
    }

    /**
     *
     */
    @Test
    public void plusPlusTest() {
        assertThat(kata.highAndLow("1 1"), is("1 1"));
    }

    /**
     *
     */
    @Test
    public void minusMinusTest() {
        assertThat(kata.highAndLow("-1 -1"), is("-1 -1"));
    }

    /**
     *
     */
    @Test
    public void plusMinusZeroTest() {
        assertThat(kata.highAndLow("1 -1 0"), is("1 -1"));
    }

    /**
     *
     */
    @Test
    public void plusPlusZeroTest() {
        assertThat(kata.highAndLow("1 1 0"), is("1 0"));
    }

    /**
     *
     */
    @Test
    public void minusMinusZeroTest() {
        assertThat(kata.highAndLow("-1 -1 0"), is("0 -1"));
    }

    /**
     *
     */
    @Test
    public void singleTest() {
        assertThat(kata.highAndLow("42"), is("42 42"));
    }
}
