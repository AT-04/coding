package org.fundacionjala.coding.abel.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AbelBarrientos on 5/30/2017.
 */
public class MovieTest {

    public static final int DAYS_RENTED = 3;

    /**
     *
     */
    @Test
    public void canCreateARegularMovie() {
        Movie movie = new Regular("Terminator");

        assertEquals("Terminator", movie.getTitle());
    }

    /**
     *
     */
    @Test
    public void canCreateAChildrenMovie() {
        Movie movie = new Children("Guardians of the Galaxy");

        assertEquals("Guardians of the Galaxy", movie.getTitle());
    }
    /**
     *
     */
    @Test
    public void canCreateANewReleaseMovie() {
        Movie movie = new NewRelease("Pirates of the Caribbean");

        assertEquals("Pirates of the Caribbean", movie.getTitle());
    }

    /**
     *
     */
    @Test
    public void canCalculatePriceOfARegularMovie() {
        Movie movie = new Regular("The Revenant");

        final double expectedResult = 4.00;
        assertEquals(expectedResult, movie.calculateAmount(DAYS_RENTED), 0.0);
    }

    /**
     *
     */
    @Test
    public void canCalculatePriceOfAChildrenMovie() {
        Movie movie = new Children("MegaMind");

        final double expectedResult = 1.50;
        assertEquals(expectedResult, movie.calculateAmount(DAYS_RENTED), 0.0);
    }

    /**
     *
     */
    @Test
    public void canCalculatePriceOfANewReleaseMovie() {
        Movie movie = new NewRelease("Alien: Covenant");

        final double expectedResult = 9.00;
        assertEquals(expectedResult, movie.calculateAmount(DAYS_RENTED), 0.0);
    }
}
