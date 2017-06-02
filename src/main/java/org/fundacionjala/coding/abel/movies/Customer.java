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
     * .
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
     * Something.
     * @return String.
     */
    private String bodyStatement() {
        totalAmount = 0;
        frequentRenterPoints = 0;
        StringBuilder bodyStatement = new StringBuilder();
        rentals.forEach(rental -> {
            double thisAmount = calculateAmount(rental);
            frequentRenterPoints = calculateFrequentRenterPoints(frequentRenterPoints, rental);
            bodyStatement.append("\t").append(rental.getMovie().getTitle()).append("\t")
                    .append(thisAmount).append(System.lineSeparator());
            totalAmount += thisAmount;
        });
        return bodyStatement.toString();
    }

    /**
     * This method calculates the amount according Movie price code.
     * @param rental The Movie rented.
     * @return Amount per movie.
     */
    private double calculateAmount(Rental rental) {
        return rental.getMovie().calculateAmount(rental.getDaysRented());
    }

    /**
     * This method calculates Frequent Renter Points.
     * @param frequentRenterPoints The total Frequent Renter Points.
     * @param rental The Movie rented.
     * @return Frequent Renter Points
     */
    private int calculateFrequentRenterPoints(int frequentRenterPoints, Rental rental) {
        return ((rental.getMovie() instanceof NewRelease) && rental.getDaysRented() > 1)
                ? frequentRenterPoints + 2 : frequentRenterPoints + 1;
    }

    /**
     * Total Rentals.
     * @return Size of Rentals.
     */
    public int size() {
        return rentals.size();
    }
}
