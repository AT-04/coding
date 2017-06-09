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
        double thisAmount = 0;
        switch (this.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                thisAmount = this.getDaysRented() > 2 ? ((this.getDaysRented() - 2) * 1.5) + 2 : 2;
                break;
            case Movie.NEW_RELEASE:
                thisAmount = this.getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount = this.getDaysRented() > 2 ? ((this.getDaysRented() - 3) * 1.5) + 1.5 : 1.5;
                break;
                default: thisAmount = 0;
        }
        return thisAmount;
    }

    /**
     * @return bonus for frequency.
     */
    public int bonusTwoDaysNewReleaseRental() {
        if ((this.getMovie().getPriceCode() == Movie.NEW_RELEASE) && this.getDaysRented() > 1) {
            return 1;
        }
        return 0;
    }
}
