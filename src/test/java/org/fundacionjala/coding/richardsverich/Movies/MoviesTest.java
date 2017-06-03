package org.fundacionjala.coding.richardsverich.movies;

import org.fundacionjala.coding.richardseverich.movies.MoviesNewRelease;
import org.fundacionjala.coding.richardseverich.movies.MoviesRegular;
import org.fundacionjala.coding.richardseverich.movies.MoviesChildren;
import org.fundacionjala.coding.richardseverich.movies.Customer;
import org.fundacionjala.coding.richardseverich.movies.Rental;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RichardSeverich on 5/31/2017.
 */
public class MoviesTest {

    public static final int EIGHT = 8;
    public static final int TREE = 3;

    /**
     * This test checks the result that returns the method, returns the expected.
     */
    @Test
    public void verifyRegularAndRelease() {

        Customer customer = new Customer("Richard Severich");
        int expectedTotalAmount = EIGHT;
        int expectedFrequentRenterPoints = TREE;
        customer.addRental(new Rental(new MoviesRegular("Pelicula Regular"), 2));
        customer.addRental(new Rental(new MoviesNewRelease("Pelicula Estreno"), 2));
        assertEquals(expectedTotalAmount, customer.getTotalAmount());
        assertEquals(expectedFrequentRenterPoints, customer.getFrequentRenterPoints());
    }

    /**
     * This test checks the result that returns the statement statement method, returns the expected.
     */
    @Test
    public void verifyRegularAndChildren() {

        Customer customer = new Customer("Richard Severich");
        int expectedTotalAmount = TREE;
        int expectedFrequentRenterPoints = TREE;
        customer.addRental(new Rental(new MoviesChildren("Pelicula Regular"), 2));
        customer.addRental(new Rental(new MoviesRegular("Pelicula Children"), 2));
        assertEquals(expectedTotalAmount, customer.getTotalAmount());
        assertEquals(expectedFrequentRenterPoints, customer.getFrequentRenterPoints());
    }

}
