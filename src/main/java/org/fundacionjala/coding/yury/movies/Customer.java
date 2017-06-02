package org.fundacionjala.coding.yury.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * This class Customer.
 */
public class Customer {
    private String name;
    private List<Rental> listRentals = new ArrayList<>();

    /**
     * @param string this name movie
     */
    public Customer(String string) {
        this.name = string;
    }

    /**
     * @param rental values of movie
     */
    public void addRental(Rental rental) {
        listRentals.add(rental);
    }

    /**
     * @return message
     */
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Rental Record for %s", name));
        stringBuilder.append("\n");
        for (Rental each : listRentals) {
            double thisAmount = 0;
            thisAmount = each.getThisAmount(each, thisAmount);
            if (each.getDaysRented() > 1 && Movie.NEW_RELEASE == each.getMovie().getPriceCode()) {
                frequentRenterPoints++;
            }
            // add frequent renter points
            frequentRenterPoints++;
            //show figures for this rental
            totalAmount += thisAmount;
            stringBuilder.append(String.format("\t%s", each.getMovie().getTitle()));
            stringBuilder.append(String.format("\t%s", String.valueOf(thisAmount)));
            stringBuilder.append("\n");
        }
        stringBuilder.append(String.format("Amount owed is %s", String.valueOf(totalAmount)));
        stringBuilder.append("\n");
        stringBuilder.append(String.format("You earned %s", String.valueOf(frequentRenterPoints)));
        stringBuilder.append(String.format(" frequent renter points"));
        return stringBuilder.toString();
    }
}
