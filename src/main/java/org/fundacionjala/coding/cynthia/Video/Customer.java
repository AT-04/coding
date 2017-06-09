package org.fundacionjala.coding.cynthia.Video;

import java.util.Enumeration;
import java.util.Vector;

/**
 * costumer class.
 */
public class Customer {
    private String customerName;
    private Vector movieRentals = new Vector();

    /**
     * constumer constructor.
     *
     * @param name of the client.
     */
    public Customer(String name) {
        customerName = name;
    }

    /**
     * add a new rental fr the customer.
     *
     * @param arg rental that will added for the customer.
     */
    public void addRental(Rental arg) {
        movieRentals.addElement(arg);
    }

    /**
     * @return name of the customer.
     */
    public String getName() {
        return customerName;
    }

    /**
     * @return all movies rented.
     */
    public String moviesRented() {
        StringBuffer result = new StringBuffer();
        Enumeration rentals = movieRentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result.append("\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.costDaysRented()) + "\n");
        }
        return result.toString();
    }

    /**
     * @return total cost for all movies rented.
     */
    public String totalCostRented() {
        StringBuffer result = new StringBuffer();
        double totalAmount = 0;
        Enumeration rentals = movieRentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            double thisAmount = each.costDaysRented();
            totalAmount += thisAmount;
        }
        result.append("Amount owed is " + String.valueOf(totalAmount) + "\n");
        return result.toString();
    }

    /**
     * @return return the bonus for all movies rented.
     */
    public String totalBonusFrequencyRented() {
        StringBuffer result = new StringBuffer();
        int frequentRenterPoints = 0;
        Enumeration rentals = movieRentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            frequentRenterPoints += 1 + each.bonusTwoDaysNewReleaseRental();
        }
        result.append("You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points");
        return result.toString();
    }

    /**
     * @return all information about movies rented for the customer.
     */
    public String statement() {
        StringBuffer result = new StringBuffer();
        result.append("Rental Record for " + getName() + "\n");
        result.append(this.moviesRented()).append(this.totalCostRented()).append(this.totalBonusFrequencyRented());
        return result.toString();
    }
}
