package org.fundacionjala.coding.abel.movies;

/**
 * Created by Unknown on 5/26/2017.
 */
public class Rental {
    private Movie movie;
    private int daysRented;

    /**
     * This is the Constructor for Rental.
     * @param movie Accepts an instance of Movie.
     * @param daysRented Int days rented.
     */
    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * Getter for days rented.
     * @return int days rented.
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * Getter for Movie.
     * @return Instance of Movie.
     */
    public Movie getMovie() {
        return movie;
    }
}
