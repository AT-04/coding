package org.fundacionjala.coding.abel.movies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Unknown on 5/26/2017.
 */
public class Customer {

    private String name;
    private List<Rental> rentals;
    private double totalAmount;
    private int frequentRenterPoints;
    private static final List<MovieType> MOVIE_TYPES = Arrays.asList(
            new MovieType(Movie.REGULAR, new Regular()),
            new MovieType(Movie.NEW_RELEASE, new NewRelease()),
            new MovieType(Movie.CHILDREN, new Children())
    );

    /**
     * This is the default constructor.
     * @param name String for customers name.
     */
    public Customer(String name) {
        this.name = name;
        rentals = new ArrayList<>();
    }

    /**
     * Method for add Rentals.
     * @param rental Instance of Rental.
     */
    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    /**
     * Getter for Customer Name.
     * @return Name of Customer.
     */
    public String getName() {
        return name;
    }

    /**
     * .
     * @return Statement.
     */
    public String statement() {
        totalAmount = 0;
        frequentRenterPoints = 0;
        String headerStatement = String.format("Rental Record for %s %s", getName(), System.lineSeparator());
        StringBuilder result = new StringBuilder();
        rentals.forEach(rental -> {
            double thisAmount = calculateAmount(rental);
            frequentRenterPoints = calculateFrequentRenterPoints(frequentRenterPoints, rental);
            //show figures for this rental
            result.append("\t").append(rental.getMovie().getTitle()).append("\t")
                    .append(thisAmount).append(System.lineSeparator());
            totalAmount += thisAmount;
        });
        String footerStatement = String.format("Amount owed is %.1f %sYou earned %d frequent renter points",
                totalAmount, System.lineSeparator(), frequentRenterPoints);
        return String.join("", headerStatement, result.toString(), footerStatement);
    }

    /**
     * This method calculates the amount acoording Movie price code.
     * @param rental The Movie rented.
     * @return Amount per movie.
     */
    private double calculateAmount(Rental rental) {
        AbstractMovieType abstractMovieType = MOVIE_TYPES.stream()
                .filter(movieType -> movieType.getType() == rental.getMovie().getPriceCode())
                .findAny()
                .orElse(null).getMovieType();
        return abstractMovieType.calculateAmount(rental.getDaysRented());
    }

    /**
     * This method calculates Frequent Renter Points.
     * @param frequentRenterPoints The total Frequent Renter Points.
     * @param rental The Movie rented.
     * @return Frequent Renter Points
     */
    private int calculateFrequentRenterPoints(int frequentRenterPoints, Rental rental) {
        // add frequent renter points
        // add bonus for a two day new release rental
        return ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && rental.getDaysRented() > 1)
                ? frequentRenterPoints + 2 : frequentRenterPoints + 1;
    }

    /**
     * Total Rentals.
     * @return Size of Rentals.
     */
    public int size() {
        return rentals.size();
    }
}
