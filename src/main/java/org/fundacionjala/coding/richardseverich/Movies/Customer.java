package org.fundacionjala.coding.richardseverich.movies;

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
     * @param rental is a rental.
     */
    public void addRental(Rental rental) {
        rentalList.add(rental);
        calculateFrequent(rental);
        calculateAmount(rental.getThisAmount());
    }

    /**
     * @return Returns the string to be displayed.
     */
    public String statement() {
        StringBuilder resultBuilder = new StringBuilder();
        String result = String.format("Rental Record for %s %n", nameCustomer);
        resultBuilder.append(result);
        for (Rental itemRental : rentalList) {
            result = String.format("\t %s \t %d %n", itemRental.getMovie().getTitle(), itemRental.getThisAmount());
            resultBuilder.append(result);
        }
        result = String.format("Amount owed is %d %n You earned %d frequent renter points",
                totalAmount, frequentRenterPoints);
        resultBuilder.append(result);
        return resultBuilder.toString();
    }

    /**
     * @param thisAmount is amount of this Rental.
     */
    private void calculateAmount(int thisAmount) {
        totalAmount += thisAmount;
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
