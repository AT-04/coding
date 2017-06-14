package org.fundacionjala.coding.richardseverich.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RichardSeverich on 6/14/2017.
 */
public class CustomerTest {


    private static final double DELTA = 0.0;

    private Customer customer;

    /**
     *
     */
    @Before
    public void setUp() {
        customer = new Customer("Test");
    }


    /**
     *
     */
    @Test
    public void canGetFrequentRenterPoints() {
        customer.addRental(new Rental(new MoviesNewRelease("The Revenant"), 2));
        customer.addRental(new Rental(new MoviesRegular("Terminator"), 2));

        final int expectedResult = 3;
        assertEquals(expectedResult, customer.calculateFrequent());
    }

    /**
     *
     */
    @Test
    public void canGetTotalAmount() {
        customer.addRental(new Rental(new MoviesNewRelease("The Revenant"), 2));
        customer.addRental(new Rental(new MoviesRegular("Terminator"), 2));

        final double expectedResult = 8;
        assertEquals(expectedResult, customer.calculateAmount(), DELTA);
    }
}
