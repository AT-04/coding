package org.fundacionjala.coding.cynthia.Video;

/**
 * movie class.
 */
public class Release extends Movie {

    /**
     * movie constructor.
     *
     * @param title     movie.
     * @param priceCode movie.
     */
    public Release(String title, int priceCode) {
        super(title, priceCode);
    }

    /**
     * @return Cost of the days rented by all movie.
     */
    @Override
    public double costDaysRented(Rental rental) {
        return rental.getDaysRented() * 3;
    }
}
