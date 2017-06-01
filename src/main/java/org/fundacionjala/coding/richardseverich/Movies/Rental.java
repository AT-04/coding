package org.fundacionjala.coding.richardseverich.Movies;

/**
 * Created by RichardSeverich on 5/31/2017.
 */
public class Rental {
    private Movie movie;
    private int daysRented;
    private int frequentRenterPoints = 0;

    /**
     * @param movie      Is movie for rented.
     * @param daysRented Is the variable that keeps the days rented.
     */
    public Rental(Movie movie, int daysRented) {

        this.movie = movie;
        this.daysRented = daysRented;
        frequentRenterPoints = movie.generateFrequent(daysRented);
    }

    /**
     * @return the variable that keeps the days rented.
     */
    public int getDaysRented() {
        return daysRented;
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


}
