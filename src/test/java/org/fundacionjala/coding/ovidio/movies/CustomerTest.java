package org.fundacionjala.coding.ovidio.movies;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by OvidioMiranda on 5/30/2017.
 */
public class CustomerTest {
    /**
     * Create.
     */
    @Test
    public void testOne() {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Movie("The Revenant", 1), 2));
        customer.addRental(new Rental(new Movie("Terminator", 0), 2));
        String statement = "Rental Record for Test\n" +
                "\tThe Revenant\t6.0\n" +
                "\tTerminator\t2.0\n" +
                "Amount owed is 8.0\n" +
                "You earned 3 frequent renter points";
        assertEquals(statement, customer.statement());
    }

}
