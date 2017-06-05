package org.fundacionjala.coding.abel.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Unknown on 5/26/2017.
 */
public class Customer {

    private String name;
    private List<Rental> rentals;
    private double totalAmount;
    private int frequentRenterPoints;

    /**
     * This is the default constructor.
     * @param name String for customers name.
     */
    public Customer(String name) {
        this.name = name;
        rentals = new ArrayList<>();
    }

    /**
     * Method for add Rentals.
     * @param rental Instance of Rental.
     */
    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    /**
     * Getter for Customer Name.
     * @return Name of Customer.
     */
    public String getName() {
        return name;
    }

    /**
     * Return the same as Main Class example.
     * @return Statement.
     */
    public String statement() {
        String headerStatement = String.format("Rental Record for %s%s", getName(), System.lineSeparator());
        String bodyStatement = bodyStatement();
        String footerStatement = String.format("Amount owed is %.1f%sYou earned %d frequent renter points",
                totalAmount, System.lineSeparator(), frequentRenterPoints);
        return String.join("", headerStatement, bodyStatement.toString(), footerStatement);
    }

    /**
     * The body string generated.
     * @return String.
     */
    private String bodyStatement() {
        StringBuilder bodyStatement = new StringBuilder();
        rentals.forEach(rental -> {
            bodyStatement.append("\t").append(rental.getMovie().getTitle()).append("\t")
                    .append(rental.getAmount()).append(System.lineSeparator());
        });
        return bodyStatement.toString();
    }

    /**
     * Calculate total amount of Rentals.
     * @return Double.
     */
    public double calculateTotalAmount() {
        rentals.forEach(rental -> totalAmount += rental.getAmount());
        return totalAmount;
    }

    /**
     * This method calculates Frequent Renter Points.
     * @return Integer.
     */
    public int calculateFrequentRenterPoints() {
        rentals.forEach(rental -> frequentRenterPoints += rental.getFrequentRenterPoints());
        return frequentRenterPoints;
    }

    /**
     * Total Rentals.
     * @return Size of Rentals.
     */
    public int size() {
        return rentals.size();
    }
}
