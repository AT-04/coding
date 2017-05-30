package org.fundacionjala.coding.ovidio.movies;

/**
 * Class for the rental.
 */
public class Rental {
    private Movie movie;
    private int daysRented;

    /**
     * @param movie movie.
     * @param daysRented day rented.
     */
    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * @return Day Rented.
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * @return Movie.
     */
    public Movie getMovie() {
        return movie;
    }
}
