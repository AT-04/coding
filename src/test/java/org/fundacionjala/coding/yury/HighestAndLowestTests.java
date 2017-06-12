package org.fundacionjala.coding.yury;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by YuryOrtuno on 6/12/2017.
 */
public class HighestAndLowestTests {

    @Test
    public void SomeTest() {
        HighestAndLowest highestAndLowest=new HighestAndLowest();
        assertThat(highestAndLowest.highAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"), is("542 -214"));
    }



    @Test
    public void PlusMinusTest() {
        HighestAndLowest highestAndLowest=new HighestAndLowest();
        assertThat(highestAndLowest.highAndLow("1 -1"), is("1 -1"));
    }

    @Test
    public void PlusPlusTest() {
        HighestAndLowest highestAndLowest=new HighestAndLowest();
        assertThat(highestAndLowest.highAndLow("1 1"), is("1 1"));
    }

    @Test
    public void MinusMinusTest() {
        HighestAndLowest highestAndLowest=new HighestAndLowest();
        assertThat(highestAndLowest.highAndLow("-1 -1"), is("-1 -1"));
    }

    @Test
    public void PlusMinusZeroTest() {
        HighestAndLowest highestAndLowest=new HighestAndLowest();
        assertThat(highestAndLowest.highAndLow("1 -1 0"), is("1 -1"));
    }

    @Test
    public void PlusPlusZeroTest() {
        HighestAndLowest highestAndLowest=new HighestAndLowest();
        assertThat(highestAndLowest.highAndLow("1 1 0"), is("1 0"));
    }

    @Test
    public void MinusMinusZeroTest() {
        HighestAndLowest highestAndLowest=new HighestAndLowest();
        assertThat(highestAndLowest.highAndLow("-1 -1 0"), is("0 -1"));
    }

    @Test
    public void SingleTest() {
        HighestAndLowest highestAndLowest=new HighestAndLowest();
        assertThat(highestAndLowest.highAndLow("42"), is("42 42"));
    }
}
