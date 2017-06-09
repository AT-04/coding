package org.fundacionjala.coding.abel.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AbelBarrientos on 5/30/2017.
 */
public class CustomerTest {

    private static final int DAYS_RENTED = 3;
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
    public void canAddRentalsToTheCustomer() {
        customer.addRental(new Rental(new Regular("Terminator"), DAYS_RENTED));
        customer.addRental(new Rental(new NewRelease("Alien: Covenant"), DAYS_RENTED));
        final int expectedResult = 2;
        assertEquals(expectedResult, customer.size());
    }

    /**
     *
     */
    @Test
    public void canGetFrequentRenterPoints() {
        customer.addRental(new Rental(new NewRelease("The Revenant"), 2));
        customer.addRental(new Rental(new Regular("Terminator"), 2));

        customer.calculateFrequentRenterPoints();

        final int expectedResult = 3;
        assertEquals(expectedResult, customer.calculateFrequentRenterPoints());
    }

    /**
     *
     */
    @Test
    public void canGetTotalAmount() {
        customer.addRental(new Rental(new NewRelease("The Revenant"), 2));
        customer.addRental(new Rental(new Regular("Terminator"), 2));

        customer.calculateTotalAmount();

        final double expectedResult = 8;
        assertEquals(expectedResult, customer.calculateTotalAmount(), DELTA);
    }

    /**
     *
     */
    @Test
    public void canGetAStatementForAllRentals() {
        customer.addRental(new Rental(new NewRelease("The Revenant"), 2));
        customer.addRental(new Rental(new Regular("Terminator"), 2));

        String expectedResult = "Rental Record for Test\n"
                + "\tThe Revenant\t6.0\n"
                + "\tTerminator\t2.0\n"
                + "Amount owed is 8.0\n"
                + "You earned 3 frequent renter points";
        assertEquals(expectedResult, customer.statement());
    }
}
