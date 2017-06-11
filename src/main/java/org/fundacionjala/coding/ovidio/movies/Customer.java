package org.fundacionjala.coding.ovidio.movies;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 */


public class Customer {
    private String name;
    private Vector rentals = new Vector();

    /**
     * @param name receibe one number.
     */
    public Customer(String name) {
        this.name = name;
    }

    /**
     * @param arg recibe a rent.
     */
    public void addRental(Rental arg) {
        rentals.addElement(arg);
    }

    /**
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * @return statement.
     */
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        StringBuilder result = new StringBuilder("Rental Record for ");
        result.append(getName());
        result.append("\n");
        while (rentals.hasMoreElements()) {
           // double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            //determine amounts for each line
            //thisAmount = each.getCharge();
            // add frequent renter points
            // add bonus for a two day new release rental
            frequentRenterPoints += each.getFrequentRenterPoints();

            // frequentRenterPoints += getFrequentRenterPoints(each);


            //show figures for this rental
            result.append("\t");
            result.append(each.getMovie().getTitle());
            result.append("\t");
            result.append(each.getCharge());
            result.append("\n");
           // String.valueOf(thisAmount);
            totalAmount += each.getCharge();
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
