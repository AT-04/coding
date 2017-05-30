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
        final int two = 2;
        final int three = 3;
        final float onePointFive = (float) 1.5;

        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            //determine amounts for each line
            switch (each.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount += two;
                    if (each.getDaysRented() > two) {
                        thisAmount += (each.getDaysRented() - two) * onePointFive;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDaysRented() * three;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += onePointFive;
                    if (each.getDaysRented() > three) {
                        thisAmount += (each.getDaysRented() - three) * onePointFive;
                    }
                    break;
                default:
                    throw new RuntimeException("unreachable");
            }
            // add frequent renter points
            frequentRenterPoints++;
            // add bonus for a two day new release rental
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE)
                    &&
                    each.getDaysRented() > 1) {
                frequentRenterPoints++;
            }
            //show figures for this rental
            result.append("\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(thisAmount) + "\n");
            totalAmount += thisAmount;
        }
        //add footer lines
        result.append("Amount owed is " + String.valueOf(totalAmount) +
                "\n");
        result.append("You earned " + String.valueOf(frequentRenterPoints)
                +
                " frequent renter points");
        return result.toString();
    }
}
