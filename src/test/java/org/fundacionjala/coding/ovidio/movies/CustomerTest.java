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
        StringBuilder newStatement = new StringBuilder("Rental Record for Test\n");
        newStatement.append("\tThe Revenant\t");
        newStatement.append("6.0\n");
        newStatement.append("\tTerminator\t");
        newStatement.append("2.0\n");
        newStatement.append("Amount owed is 8.0\n");
        newStatement.append("You earned 3 frequent renter points");
        assertEquals(newStatement.toString(), customer.statement());
    }

}


