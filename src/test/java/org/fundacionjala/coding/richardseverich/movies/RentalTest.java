package org.fundacionjala.coding.richardseverich.movies;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RichardSeverich on 6/14/2017.
 */
public class RentalTest {

    private static final int DAYS_RENTED = 3;
    private static final double DELTA = 0.0;
    private Rental rental;

    /**
     *
     */
    @Before
    public void setUp() {
        rental = new Rental(new MoviesRegular("Regular"), DAYS_RENTED);
    }

    /**
     *
     */
    @Test
    public void verifyThatRentalCalculateRentalPrice() {
        final double expectedResult = 3.5;
        assertEquals(expectedResult, rental.getThisAmount(), DELTA);
    }

    /**
     *
     */
    @Test
    public void verifyThatRentalCalculateRentalFrequent() {
        final int expectedResult = 2;
        assertEquals(expectedResult, rental.frequentRenterPoints());
    }
}
