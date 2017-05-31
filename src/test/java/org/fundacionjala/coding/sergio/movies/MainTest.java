package org.fundacionjala.coding.sergio.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by SergioNavarro on 5/30/2017.
 */
public class MainTest {

    @Test
    public void mainPrueba() {
        Customer comprador = new Customer();

        assertTrue(comprador instanceof Customer);
    }

    @Test
    public void prueba2() {
        Customer comprador = new Customer("otro nombre");

        assertEquals("otro nombre", comprador.getName());
    }
    @Test
    public void pruebadeStatement() {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Movie("The Revenant", 1), 2));
        customer.addRental(new Rental(new Movie("Terminator", 0), 2));

        assertEquals("Rental Record for Test" + "\n" + "\tThe Revenant\t6.0" + "\n" + "\tTerminator\t2.0"
                + "\n" + "Amount owed is 8.0" + "\n" + "You earned 3 frequent renter points", customer.statement());
    }

}