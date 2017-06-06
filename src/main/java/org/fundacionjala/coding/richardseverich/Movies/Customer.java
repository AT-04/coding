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
    }

    /**
     * @return Returns the string to be displayed.
     */
    public String statement() {
        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append(String.format("Rental Record for %s %n", nameCustomer));
        for (Rental itemRental : rentalList) {
            resultBuilder.append(String.format("\t %s \t %d %n", itemRental.getMovie().getTitle(),
                    itemRental.getThisAmount()));
        }
        resultBuilder.append(String.format("Amount owed is %d %nYou earned %d frequent renter points",
                totalAmount, frequentRenterPoints));
        return resultBuilder.toString();
    }

    /**
     *
     */
    public void calculateAmount() {
        for (Rental itemRental : rentalList) {
            totalAmount += itemRental.getThisAmount();
        }
    }

    /**
     *
     */
    public void calculateFrequent() {
        for (Rental itemRental : rentalList) {
            frequentRenterPoints += itemRental.getFrequentRenterPoints() + 1;
        }
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
