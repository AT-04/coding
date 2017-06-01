package org.fundacionjala.coding.richardseverich.Movies;

import java.util.ArrayList;

class Customer {
    private String nameCustomer;
    private ArrayList<Rental> rentalList;
    public Customer(String name) {
        nameCustomer = name;
        rentalList = new ArrayList<Rental>();
    }
    public void addRental(Rental arg) {
        rentalList.add(arg);
    }
    public String statement() {

        double totalAmount = 0;
        StringBuilder result = new StringBuilder();
        result.append("Rental Record for "); result.append(nameCustomer);result.append("\n");
        int frequentRenterPoints = 0;

        for (Rental itemRental : rentalList)
        {
            int daysRented = itemRental.getDaysRented();
            int thisAmount = itemRental.getMovie().generatePrice(daysRented);
            frequentRenterPoints++;
            frequentRenterPoints+=itemRental.frequentRenterPoints;
            result.append("\t"); result.append(itemRental.getMovie().getTitle());
            result.append("\t"); result.append(String.valueOf(thisAmount));
            result.append("\n");totalAmount += thisAmount;
        }

        result.append("Amount owed is "); result.append(String.valueOf(totalAmount));
        result.append("\n"); result.append("You earned ");
        result.append(String.valueOf(frequentRenterPoints)); result.append(" frequent renter points");
        return result.toString();
    }

}
