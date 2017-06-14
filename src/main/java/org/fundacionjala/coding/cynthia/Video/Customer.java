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
    public double totalCostRented() {
        movieRentals.forEach(rental -> {
            totalAmount += rental.costDaysRented();
        });
        return totalAmount;
    }

    /**
     * @return return the bonus for all movies rented.
     */
    public int totalBonusFrequencyRented() {
        movieRentals.forEach(rental -> {
            frequentRenterPoints += 1 + rental.bonusTwoDaysNewReleaseRental();
        });
        return frequentRenterPoints;
    }

    /**
     * @return all information about movies rented for the customer.
     */
    public String statement() {
        StringBuffer result = new StringBuffer();
        result.append("Rental Record for " + getName() + "\n");
        result.append(this.moviesRented());
        result.append("Amount owed is " + String.valueOf(this.totalCostRented()) + "\n");
        result.append("You earned " + String.valueOf(this.totalBonusFrequencyRented()) + " frequent renter points");
        return result.toString();
    }
}
