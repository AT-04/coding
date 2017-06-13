package org.fundacionjala.coding.abel.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AbelBarrientos on 5/30/2017.
 */
public class RentalTest {

    private static final int DAYS_RENTED = 3;
    private static final double DELTA = 0.0;

    /**
     *
     */
    @Test
    public void canCalculateRentalPriceOfANewReleaseMovie() {
        Rental rental = new Rental(new NewRelease("Alien: Covenant"), DAYS_RENTED);

        final double expectedResult = 9.00;
        assertEquals(expectedResult, rental.calculateRentalAmount(), DELTA);
    }

    /**
     *
     */
    @Test
    public void canCalculateRentalFrequentRenterPointsOfARegularMovie() {
        Rental rental = new Rental(new Regular("The Revenant"), DAYS_RENTED);

        final int expectedResult = 1;
        assertEquals(expectedResult, rental.calculateRentalFrequentRenterPoints());
    }
}
