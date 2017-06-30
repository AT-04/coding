package org.fundacionjala.coding.richard.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RichardSeverich on 6/14/2017.
 */
public class MoviesRegularTest {

    private MoviesRegular movie;
    private static final int ZERO = 0;
    private static final int EXPECTED_RESULT = 2;
    private static final int DAYS_RENTAL = 2;

    /**
     *
     */
    @Before
    public void setUp() {
        movie = new MoviesRegular("Regular");
    }

    /**
     *
     */
    @Test
    public void verifyRegularMovieGeneratePrice() {
        assertEquals(EXPECTED_RESULT, movie.generatePrice(DAYS_RENTAL), ZERO);
    }

    /**
     *
     */
    @Test
    public void verifyRegularMovieGenerateFrequent() {
        assertEquals(EXPECTED_RESULT, movie.generateFrequent(DAYS_RENTAL), ZERO);
    }
}
