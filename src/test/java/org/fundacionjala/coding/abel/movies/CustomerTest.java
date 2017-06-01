package org.fundacionjala.coding.abel.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AbelBarrientos on 5/30/2017.
 */
public class CustomerTest {

    private static final int DAYS_RENTED = 3;
    private Customer customer;

    /**
     *
     */
    @Before
    public void setUp() {
        customer = new Customer("John Doe");
    }

    /**
     *
     */
    @Test
    public void canCreateACustomerWithJohnDoeName() {
        assertEquals("John Doe", customer.getName());
    }

    /**
     *
     */
    @Test
    public void canAddRentalsToTheCustomer() {
        customer.addRental(new Rental(new Movie("Terminator", 1), DAYS_RENTED));
        customer.addRental(new Rental(new Movie("Alien: Covenant", 1), DAYS_RENTED));
        assertEquals(2, customer.size());
    }

    /**
     *
     */
    @Test
    public void canGetAStatementForAllRentals() {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Movie("The Revenant", 1), 2));
        customer.addRental(new Rental(new Movie("Terminator", 0), 2));

        String expectedResult = "Rental Record for Test \n"
                + "\tThe Revenant\t6.0\n"
                + "\tTerminator\t2.0\n"
                + "Amount owed is 8.0 \n"
                + "You earned 3 frequent renter points";
        assertEquals(expectedResult, customer.statement());
    }
}
