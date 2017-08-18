package org.fundacionjala.coding.ovidio.movies;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */


public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<Rental>();

    /**
     * @param name name.
     */
    public Customer(String name) {
        this.name = name;
    }

    /**
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * @param rental rental.
     */
    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    /**
     * @return statement.
     */
    public String statement() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Rental Record for %s%s", getName(), "\n"));
        for (Rental rental : rentals) {

            result.append("\t")
                    .append(rental.getMovie().getTitle())
                    .append("\t")
                    .append(String.valueOf(rental.getCharge()))
                    .append("\n");
        }
        result.append("Amount owed is ")
                .append(String.valueOf(getTotalCharge()))
                .append("\n");
        result.append("You earned ")
                .append(String.valueOf(getTotalFrequentRenterPoints()))
                .append(" frequent renter points");

        return result.toString();
    }

    /**
     * @return double.
     */
    private double getTotalCharge() {
        double total = 0;
        for (Rental rental : rentals) {
            total += rental.getCharge();
        }
        return total;
    }

    /**
     * @return int.
     */
    private int getTotalFrequentRenterPoints() {
        int total = 0;
        for (Rental rental : rentals) {
            total += rental.getFrequentRenterPoints();
        }
        return total;
    }

}
