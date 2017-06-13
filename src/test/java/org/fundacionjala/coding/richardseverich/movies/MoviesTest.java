
package org.fundacionjala.coding.richardseverich.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RichardSeverich on 5/31/2017.
 */
public class MoviesTest {

    private static final int EIGHT = 8;
    private static final int TREE = 3;
    private Customer customer;

    /**
     *
     */
    @Before
    public void setUp() {
        customer = new Customer("Richard Severich");
    }

    /**
     *
     */
    @Test
    public void verifyStringPrint() {
        String expectResult = "Rental Record for Richard Severich\n"
                + "\tThe Revenant\t6.0\n"
                + "\tTerminator\t2.0\n"
                + "Amount owed is 8.0\n"
                + "You earned 3 frequent renter points";
        customer.addRental(new Rental(new MoviesNewRelease("The Revenant"), 2));
        customer.addRental(new Rental(new MoviesRegular("Terminator"), 2));
        assertEquals(expectResult, customer.statement());
    }

    /**
     *
     */
    @Test
    public void verifyRegularAndRelease() {
        customer.addRental(new Rental(new MoviesRegular("Pelicula Regular"), 2));
        customer.addRental(new Rental(new MoviesNewRelease("Pelicula Estreno"), 2));
        assertEquals(EIGHT, customer.calculateAmount());
        assertEquals(TREE, customer.calculateFrequent());

    }

    /**
     *
     */
    @Test
    public void verifyRegularAndChildren() {
        customer.addRental(new Rental(new MoviesChildren("Pelicula Children"), 2));
        customer.addRental(new Rental(new MoviesRegular("Pelicula Regular"), 2));
        assertEquals(TREE, customer.calculateAmount());
        assertEquals(TREE, customer.calculateFrequent());
    }
}
