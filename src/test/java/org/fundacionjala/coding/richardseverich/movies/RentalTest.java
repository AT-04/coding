package org.fundacionjala.coding.richardseverich.movies;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RichardSeverich on 6/14/2017.
 */
public class RentalTest {

    private static final int DAYS_RENTED = 3;
    private static final double DELTA = 0.0;

    /**
     *
     */
    @Test
    public void canCalculateRentalPriceOfANewReleaseMovie() {
        Rental rental = new Rental(new MoviesNewRelease("Alien: Covenant"), DAYS_RENTED);

        final double expectedResult = 9.00;
        assertEquals(expectedResult, rental.getThisAmount(), DELTA);
    }

    /**
     *
     */
    @Test
    public void canCalculateRentalFrequentRenterPointsOfARegularMovie() {
        Rental rental = new Rental(new MoviesRegular("The Revenant"), DAYS_RENTED);

        final int expectedResult = 2;
        assertEquals(expectedResult, rental.frequentRenterPoints());
    }
}
