package org.fundacionjala.coding.abel.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by AbelBarrientos on 5/30/2017.
 */
public class RentalTest {

    @Test
    public void canCreateARentalForTerminatorMovie() {
        Rental rental = new Rental(new Movie("Terminator", 1), 3);

        assertTrue(rental.getMovie() instanceof Movie);
        assertEquals(3, rental.getDaysRented());
    }
}
