package org.fundacionjala.coding.cynthia.Video;

/**
 * Rental Class.
 */
public class Rental {
    private Movie movie;
    private int daysRented;

    /**
     * Rental constructor.
     *
     * @param movie rental.
     * @param daysRented rental.
     */
    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * get days rented.
     *
     * @return number of days by movie rented.
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * @return movie rented.
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * @return Cost of the days rented by all movie.
     */
    public double costDaysRented() {
        return movie.costDaysRented(this);
    }

    /**
     * @return bonus for frequency.
     */
    public int bonusTwoDaysNewReleaseRental() {
        return movie.bonusTwoDaysNewReleaseRental(this);
    }
}
