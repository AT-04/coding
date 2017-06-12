package org.fundacionjala.coding.richardseverich.movies;

/**
 * Created by RichardSeverich on 5/31/2017.
 */
public class Rental {
    private Movie movie;
    private int daysRented;
    private int frequentRenterPoints;

    /**
     * @param movie      Is movie for rented.
     * @param daysRented Is the variable that keeps the days rented.
     */
    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     *
     */
    public void frequentRenterPoints() {
        frequentRenterPoints = movie.generateFrequent(daysRented);
    }

    /**
     * @return the movie.
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * @return the frequent renter points.
     */
    public int getFrequentRenterPoints() {
        return frequentRenterPoints;
    }

    /**
     * @return return amount of rental.
     */
    public int getThisAmount() {
        return movie.generatePrice(daysRented);
    }
}
