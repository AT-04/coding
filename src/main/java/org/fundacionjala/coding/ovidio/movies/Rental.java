package org.fundacionjala.coding.ovidio.movies;

/**
 * Class for the rental.
 */

public class Rental {
    private Movie movie;
    private int daysRented;

    /**
     * @param movie      movie.
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

    /**
     * @return double.
     */
    double getCharge() {
        final int two = 2;
        final int three = 3;
        final float onePointFive = (float) 1.5;
        double thisAmount = 0;
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += two;
                if (getDaysRented() > two) {
                    thisAmount += (getDaysRented() - two) * onePointFive;
                }
                break;
            case Movie.NEW_RELEASE:
                thisAmount += getDaysRented() * three;
                break;
            case Movie.CHILDRENS:
                thisAmount += onePointFive;
                if (getDaysRented() > three) {
                    thisAmount += (getDaysRented() - three) * onePointFive;
                }
                break;
            default:
                throw new RuntimeException("unreachable");
        }
        return thisAmount;

    }

    /**
     * @return frecuentRenter.
     */
    int getFrequentRenterPoints() {
        return ((getMovie().getPriceCode() == Movie.NEW_RELEASE)
                && getDaysRented() > 1) ? 2 : 1;
    }
}
