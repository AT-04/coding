package org.fundacionjala.coding.abel.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AbelBarrientos on 5/30/2017.
 */
public class MovieTest {

    @Test
    public void canCreateAMovieForTerminator() {
        Movie movie = new Movie("Terminator", 1);

        assertEquals("Terminator", movie.getTitle());
        assertEquals(1, movie.getPriceCode());
    }

    @Test
    public void canCreateAMovieForGuardiansOfTheGalaxy() {
        Movie movie = new Movie("Guardians of the Galaxy", - 1);

        assertEquals("Guardians of the Galaxy", movie.getTitle());
        assertEquals(- 1, movie.getPriceCode());
    }
}
