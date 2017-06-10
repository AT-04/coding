package org.fundacionjala.coding.cynthia.Video;

import java.util.ArrayList;
import java.util.List;

/**
 * costumer class.
 */
public class Customer {
    private String customerName;
    private List<Rental> movieRentals;
    private double totalAmount = 0;
    private int frequentRenterPoints;

    /**
     * constumer constructor.
     *
     * @param name of the client.
     */
    public Customer(String name) {
        customerName = name;
        movieRentals = new ArrayList<>();
    }

    /**
     * add a new rental fr the customer.
     *
     * @param arg rental that will added for the customer.
     */
    public void addRental(Rental arg) {
        movieRentals.add(arg);
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
        movieRentals.forEach(rental -> {
            result.append("\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.costDaysRented()) + "\n");
        });
        return result.toString();
    }

    /**
     * @return total cost for all movies rented.
     */
    public String totalCostRented() {
        StringBuffer result = new StringBuffer();
        movieRentals.forEach(rental -> {
            totalAmount += rental.costDaysRented();
        });
        result.append("Amount owed is " + String.valueOf(totalAmount) + "\n");
        return result.toString();
    }

    /**
     * @return return the bonus for all movies rented.
     */
    public String totalBonusFrequencyRented() {
        StringBuffer result = new StringBuffer();
        movieRentals.forEach(rental -> {
            frequentRenterPoints += 1 + rental.bonusTwoDaysNewReleaseRental();
        });
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
