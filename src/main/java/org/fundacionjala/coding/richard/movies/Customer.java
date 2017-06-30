package org.fundacionjala.coding.richard.movies;

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
     * @return Amount of rented.
     */
    public double calculateAmount() {
        return rentalList.stream()
                .mapToDouble(Rental::getThisAmount)
                .sum();
    }

    /**
     * @return Frequent of Rented.
     */
    public int calculateFrequent() {
        return rentalList.stream()
                .mapToInt(Rental::frequentRenterPoints)
                .sum();
    }

    /**
     * @return Name of Customer.
     */
    public String getNameCustomer() {
        return nameCustomer;
    }
}
