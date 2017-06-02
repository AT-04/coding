package org.fundacionjala.coding.richardseverich.Movies;

import java.util.ArrayList;

/**
 * Created by RichardSeverich on 5/31/2017.
 */
public class Customer {
    private String nameCustomer;
    private ArrayList<Rental> rentalList;
    private int totalAmount;
    private int frequentRenterPoints;

    /**
     * @param name is name of costumer.
     */
    public Customer(String name) {
        nameCustomer = name;
        rentalList = new ArrayList<>();
    }

    /**
     * @param arg is a rental.
     */
    public void addRental(Rental arg) {
        rentalList.add(arg);
    }

    /**
     * @return Returns the string to be displayed.
     */
    public String statement() {
        StringBuilder resultBuilder = new StringBuilder();
        String result = String.format("Rental Record for %s %n", nameCustomer);
        resultBuilder.append(result);
        for (Rental itemRental : rentalList) {
            calculateFrequent(itemRental);
            result = String.format("\t %s \t %d %n", itemRental.getMovie().getTitle(), calculateThisAmount(itemRental));
            resultBuilder.append(result);
        }
        result = String.format("Amount owed is %d %n You earned %d frequent renter points",
                totalAmount, frequentRenterPoints);
        resultBuilder.append(result);
        return resultBuilder.toString();
    }

    /**
     * @param itemRental is a rental.
     * @return Returns the amount for movie.
     */
    private int calculateThisAmount(Rental itemRental) {
        int daysRented = itemRental.getDaysRented();
        int thisAmount = itemRental.getMovie().generatePrice(daysRented);
        totalAmount += thisAmount;
        return thisAmount;
    }

    /**
     * @param itemRental is a rental.
     */
    private void calculateFrequent(Rental itemRental) {
        frequentRenterPoints++;
        frequentRenterPoints += itemRental.getFrequentRenterPoints();
    }

    /**
     * @return Returns the total amount.
     */
    public int getTotalAmount() {
        return totalAmount;
    }

    /**
     * @return Returns the frequent Renter points.
     */
    public int getFrequentRenterPoints() {
        return frequentRenterPoints;
    }

}
