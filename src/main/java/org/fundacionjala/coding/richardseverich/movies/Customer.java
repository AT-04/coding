package org.fundacionjala.coding.richardseverich.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RichardSeverich on 5/31/2017.
 */
public class Customer {
    private String nameCustomer;
    private List<Rental> rentalList;

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
        resultBuilder.append(String.format("Rental Record for %s%n", nameCustomer));
        for (Rental itemRental : rentalList) {
            resultBuilder.append(String.format("\t%s\t%d.0%n", itemRental.getMovie().getTitle(),
                    itemRental.getThisAmount()));
        }
        resultBuilder.append(String.format("Amount owed is %d.0%n You earned %d frequent renter points",
                calculateAmount(), calculateFrequent()));
        return resultBuilder.toString();
    }

    /**
     * @return Amount of rented.
     */
    public int calculateAmount() {
        int totalAmount = 0;
        for (Rental itemRental : rentalList) {
            totalAmount += itemRental.getThisAmount();
        }
        return totalAmount;
    }

    /**
     * @return Frequent of Rented.
     */
    public int calculateFrequent() {
        int frequentRenterPoints = 0;
        for (Rental itemRental : rentalList) {
            itemRental.frequentRenterPoints();
            frequentRenterPoints += itemRental.getFrequentRenterPoints() + 1;
        }
        return frequentRenterPoints;
    }
}
