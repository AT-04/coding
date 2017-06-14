package org.fundacionjala.coding.abel.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AbelBarrientos on 5/30/2017.
 */
public class MovieTest {

    private static final int DAYS_RENTED = 3;
    private static final double DELTA = 0.0;

    /**
     *
     */
    @Test
    public void canCalculatePriceOfARegularMovie() {
        Movie movie = new Regular("The Revenant");

        final double expectedResult = 4.00;
        assertEquals(expectedResult, movie.calculateAmount(DAYS_RENTED), DELTA);
    }

    /**
     *
     */
    @Test
    public void canCalculatePriceOfAChildrenMovie() {
        Movie movie = new Children("MegaMind");

        final double expectedResult = 1.50;
        assertEquals(expectedResult, movie.calculateAmount(DAYS_RENTED), DELTA);
    }

    /**
     *
     */
    @Test
    public void canCalculatePriceOfANewReleaseMovie() {
        Movie movie = new NewRelease("Alien: Covenant");

        final double expectedResult = 9.00;
        assertEquals(expectedResult, movie.calculateAmount(DAYS_RENTED), DELTA);
    }

    /**
     *
     */
    @Test
    public void canCalculateFrequentRenterPointsOfARegularMovie() {
        Movie movie = new Regular("The Revenant");

        final int expectedResult = 1;
        assertEquals(expectedResult, movie.calculateFrequentRenterPoints(DAYS_RENTED));
    }

    /**
     *
     */
    @Test
    public void canCalculateFrequentRenterPointsOfAChildrenMovie() {
        Movie movie = new Children("MegaMind");

        final int expectedResult = 1;
        assertEquals(expectedResult, movie.calculateFrequentRenterPoints(DAYS_RENTED));
    }

    /**
     *
     */
    @Test
    public void canCalculateFrequentRenterPointsOfANewReleaseMovie() {
        Movie movie = new NewRelease("Alien: Covenant");

        final int expectedResult = 2;
        assertEquals(expectedResult, movie.calculateFrequentRenterPoints(DAYS_RENTED));
    }
}
