package org.fundacionjala.coding.richardseverich.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RichardSeverich on 6/14/2017.
 */
public class CustomerTest {

    private static final int EXPECTED_RESULT = 3;
    private static final double DELTA = 0.0;
    private Customer customer;

    /**
     *
     */
    @Before
    public void setUp() {
        customer = new Customer("Test");
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
    public void verifyRegularAndReleaseCalculateAmount() {
        customer.addRental(new Rental(new MoviesRegular("Pelicula Regular"), 2));
        customer.addRental(new Rental(new MoviesNewRelease("Pelicula Estreno"), 2));
        final int expectResult = 8;
        assertEquals(expectResult, customer.calculateAmount(), DELTA);
    }

    /**
     *
     */
    @Test
    public void verifyRegularAndReleaseCalculateFrequent() {
        customer.addRental(new Rental(new MoviesRegular("Pelicula Regular"), 2));
        customer.addRental(new Rental(new MoviesNewRelease("Pelicula Estreno"), 2));
        assertEquals(EXPECTED_RESULT, customer.calculateFrequent());
    }

    /**
     *
     */
    @Test
    public void verifyRegularAndChildrenCalculateAmount() {
        customer.addRental(new Rental(new MoviesChildren("Pelicula Children"), 2));
        customer.addRental(new Rental(new MoviesRegular("Pelicula Regular"), 2));
        final double expectResult = 3.5;
        assertEquals(expectResult, customer.calculateAmount(), DELTA);

    }

    /**
     *
     */
    @Test
    public void verifyRegularAndChildrenCalculateFrequent() {
        customer.addRental(new Rental(new MoviesChildren("Pelicula Children"), 2));
        customer.addRental(new Rental(new MoviesRegular("Pelicula Regular"), 2));
        assertEquals(EXPECTED_RESULT, customer.calculateFrequent());
    }

}
