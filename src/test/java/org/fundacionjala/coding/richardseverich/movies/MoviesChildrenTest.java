package org.fundacionjala.coding.richardseverich.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RichardSeverich on 6/14/2017.
 */
public class MoviesChildrenTest {

    private MoviesChildren movie;
    private static final int ZERO = 0;
    private static final int DAYS_RENTAL = 2;

    /**
     *
     */
    @Before
    public void setUp() {
        movie = new MoviesChildren("Children");
    }

    /**
     *
     */
    @Test
    public void verifyChildrenMovieGeneratePrice() {
        final double expectedResult = 1.5;
        assertEquals(expectedResult, movie.generatePrice(DAYS_RENTAL), ZERO);
    }

    /**
     *
     */
    @Test
    public void verifyChildrenMovieGenerateFrequent() {
        final int expectedResult = 1;
        assertEquals(expectedResult, movie.generateFrequent(DAYS_RENTAL), ZERO);
    }
}
