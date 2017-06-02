package org.fundacionjala.coding.yury.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by YuryOrtuno on 5/30/2017.
 */
public class MovieTest {

    /**
     *
     */
    @Test
    public void result() {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Movie("The Revenant", 1), 2));
        customer.addRental(new Rental(new Movie("Terminator", 0), 2));
        String expectedResult = "Rental Record for Test\n"
                + "\tThe Revenant\t6.0\n"
                + "\tTerminator\t2.0\n"
                + "Amount owed is 8.0\n"
                + "You earned 3 frequent renter points";
        assertEquals(expectedResult, customer.statement());
        System.out.println(customer.statement());

    }


}
