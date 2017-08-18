package org.fundacionjala.coding.ovidio.movies;

/**
 * Class for the rental.
 */
public class Rental {

    private Movie movie;
    private int daysRented;

    /**
     * @param movie      movie.
     * @param daysRented day.
     */
    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * @return Movie.
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * @return int.
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * @return double.
     */
    public double getCharge() {
        return movie.getCharge(daysRented);
    }

    /**
     * @return int.
     */
    public int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(daysRented);
    }
}
