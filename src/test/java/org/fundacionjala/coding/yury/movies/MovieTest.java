package test.java.org.fundacionjala.coding.yury.movies;

import main.java.org.fundacionjala.coding.yury.movies.Customer;
import main.java.org.fundacionjala.coding.yury.movies.Movie;
import main.java.org.fundacionjala.coding.yury.movies.Rental;
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
        String line1 = "Rental Record for Test\n";
        String line2 = "\tThe Revenant\t6.0\n";
        String line3 = "\tTerminator\t2.0\n";
        String line4 = "Amount owed is 8.0\n";
        String line5 = "You earned 3 frequent renter points";
        assertEquals(String.format("%s%s%s%s%s", line1, line2, line3, line4, line5), customer.statement());
        System.out.println(customer.statement());

    }


}
