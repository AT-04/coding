package org.fundacionjala.coding.richardseverich.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RichardSeverich on 6/14/2017.
 */
public class MoviesNewReleaseTest {

    private MoviesNewRelease movie;
    private static final int ZERO = 0;
    private static final int DAYS_RENTAL = 2;

    /**
     *
     */
    @Before
    public void setUp() {
        movie = new MoviesNewRelease("New Release");
    }

    /**
     *
     */
    @Test
    public void verifyNewReleaseMovieGeneratePrice() {
        final int expectedResult = 6;
        assertEquals(expectedResult, movie.generatePrice(DAYS_RENTAL), ZERO);
    }

    /**
     *
     */
    @Test
    public void verifyNewReleaseMovieGenerateFrequent() {
        final int expectedResult = 1;
        assertEquals(expectedResult, movie.generateFrequent(DAYS_RENTAL), ZERO);
    }

    /**
     *
     */
    @Test
    public void verifyNewReleaseMovie() {
        String expectedResult = "New Release";
        assertEquals(expectedResult, movie.getTitle());
    }
}
