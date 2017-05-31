package org.fundacionjala.coding.richard.movies;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

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

    public String getName() {
        return nameCustomer;
    }

    public String statement() {

        double totalAmount = 0;
        int frequentRenterPoints = 0;

        StringBuilder result = new StringBuilder();
        result.append("Rental Record for " + getName() + "\n");

        for (Rental itemRental : rentalList) {

            double thisAmount = 0;
            int daysRented = itemRental.getDaysRented();
            int priceOfMovie = itemRental.getMovie().getPriceCode();

            switch (priceOfMovie) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    thisAmount += (daysRented > 2) ? (daysRented - 2) * 1.5 : 0;
                    // add bonus for a two day new release rental
                    frequentRenterPoints += (daysRented > 1) ? 1 : 0;
                    break;

                case Movie.NEW_RELEASE:
                    thisAmount += daysRented * 3;
                    break;

                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    thisAmount += (daysRented > 3) ? (daysRented - 3) * 1.5 : 0;
                    break;
            }

            // add frequent renter points
            frequentRenterPoints++;

            //show figures for this rental
            result.append("\t");
            result.append(itemRental.getMovie().getTitle());
            result.append("\t");
            result.append(String.valueOf(thisAmount));
            result.append("\n");
            totalAmount += thisAmount;
        }

        //add footer lines
        result.append("Amount owed is ");
        result.append(String.valueOf(totalAmount));
        result.append("\n");
        result.append("You earned ");
        result.append(String.valueOf(frequentRenterPoints));
        result.append(" frequent renter points");
        return result.toString();
    }


}
