package org.fundacionjala.coding.abel.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by AbelBarrientos on 5/30/2017.
 */
public class RentalTest {

    private static final int DAYS_RENTED = 3;

    /**
     *
     */
    @Test
    public void canCreateARentalForTerminatorMovie() {
        Rental rental = new Rental(new Movie("Terminator", 1), DAYS_RENTED);

        assertTrue(Movie.class.isInstance(rental.getMovie()));
        assertEquals(DAYS_RENTED, rental.getDaysRented());
    }
}
