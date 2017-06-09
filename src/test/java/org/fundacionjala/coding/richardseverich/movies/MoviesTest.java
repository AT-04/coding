
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
     * This test checks the result that returns the method, returns the expected.
     */
    @Test
    public void verifyRegularAndRelease() {
        customer.addRental(new Rental(new MoviesRegular("Pelicula Regular"), 2));
        customer.addRental(new Rental(new MoviesNewRelease("Pelicula Estreno"), 2));
        assertEquals(EIGHT, customer.calculateAmount());
        assertEquals(TREE, customer.calculateFrequent());
        System.out.print(customer.statement());
    }

    /**
     * This test checks the result that returns the statement statement method, returns the expected.
     */
    @Test
    public void verifyRegularAndChildren() {
        customer.addRental(new Rental(new MoviesChildren("Pelicula Regular"), 2));
        customer.addRental(new Rental(new MoviesRegular("Pelicula Children"), 2));
        assertEquals(TREE, customer.calculateAmount());
        assertEquals(TREE, customer.calculateFrequent());
    }
}
