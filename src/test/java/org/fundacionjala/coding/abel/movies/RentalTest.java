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
    public void canCreateARentalForRegularMovie() {
        Rental rental = new Rental(new Regular("Terminator"), DAYS_RENTED);

        final double expectedResult = 4.00;
        assertTrue(Movie.class.isInstance(rental.getMovie()));
        assertEquals(DAYS_RENTED, rental.getDaysRented());
        assertEquals(expectedResult, rental.getMovie().calculateAmount(DAYS_RENTED), 0.0);
    }
}
