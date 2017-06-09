package org.fundacionjala.coding.cynthia;

import org.fundacionjala.coding.cynthia.Video.Customer;
import org.fundacionjala.coding.cynthia.Video.Movie;
import org.fundacionjala.coding.cynthia.Video.Rental;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by USUARIO on 07/06/2017.
 */
public class VideoTest {

    /**
     * verify the rental for one customer (RELESEA, CHILDREN).
     */
    @Test
    public void testVideoOnCustomer() {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Movie("The Revenant", 1), 2));
        customer.addRental(new Rental(new Movie("Terminator", 0), 2));
        assertEquals("Rental Record for Test\n"
                + "\tThe Revenant\t6.0\n"
                + "\tTerminator\t2.0\n"
                + "Amount owed is 8.0\n"
                + "You earned 3 frequent renter points", customer.statement());
    }

    /**
     * verify just to one rented movie (RELEASE movie).
     */
    @Test
    public void testVideoOneVideoRented() {
        Customer customer = new Customer("Juan");
        customer.addRental(new Rental(new Movie("The Revenant", 1), 4));
        assertEquals("Rental Record for Juan\n"
                + "\tThe Revenant\t12.0\n"
                + "Amount owed is 12.0\n"
                + "You earned 2 frequent renter points", customer.statement());
    }

    /**
     * verify the rental whithout bonus.
     */
    @Test
    public void testVideoWithoutBonus() {
        Customer customer = new Customer("Pedro");
        customer.addRental(new Rental(new Movie("The Revenant", 1), 1));
        assertEquals("Rental Record for Pedro\n"
                + "\tThe Revenant\t3.0\n"
                + "Amount owed is 3.0\n"
                + "You earned 1 frequent renter points", customer.statement());
    }

    /**
     * verify the rental for several movies.
     */
    @Test
    public void testVideoSeveralMovies() {
        Customer customer = new Customer("Oscar");
        customer.addRental(new Rental(new Movie("The Revenant", 0), 1));
        customer.addRental(new Rental(new Movie("Cars", 1), 2));
        customer.addRental(new Rental(new Movie("king kong", 2), 5));
        customer.addRental(new Rental(new Movie("Titanic", 0), 3));
        customer.addRental(new Rental(new Movie("Galaxy", 2), 4));
        assertEquals("Rental Record for Oscar\n"
                + "\tThe Revenant\t2.0\n"
                + "\tCars\t6.0\n"
                + "\tking kong\t4.5\n"
                + "\tTitanic\t3.5\n"
                + "\tGalaxy\t3.0\n"
                + "Amount owed is 19.0\n"
                + "You earned 6 frequent renter points", customer.statement());
    }

    /**
     * verify rental for two customers.
     */
    @Test
    public void testVideoTwoCustomers() {
        Customer marcan = new Customer("marcan");
        Customer agustin = new Customer("Agustin");
        marcan.addRental(new Rental(new Movie("The Revenant", 0), 1));
        marcan.addRental(new Rental(new Movie("Cars", 1), 2));
        marcan.addRental(new Rental(new Movie("king kong", 2), 5));
        agustin.addRental(new Rental(new Movie("Titanic", 0), 3));
        agustin.addRental(new Rental(new Movie("Galaxy", 2), 4));
        assertEquals("Rental Record for marcan\n"
                + "\tThe Revenant\t2.0\n"
                + "\tCars\t6.0\n"
                + "\tking kong\t4.5\n"
                + "Amount owed is 12.5\n"
                + "You earned 4 frequent renter points", marcan.statement());
        assertEquals("Rental Record for Agustin\n"
                + "\tTitanic\t3.5\n"
                + "\tGalaxy\t3.0\n"
                + "Amount owed is 6.5\n"
                + "You earned 2 frequent renter points", agustin.statement());
    }
}
