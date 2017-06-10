package org.fundacionjala.coding.cynthia.Video;

/**
 * movie class.
 */
public class Regular extends Movie {
    public static final int REGULAR = 0;

    /**
     * movie constructor.
     *
     * @param title     movie.
     * @param priceCode movie.
     */
    public Regular(String title, int priceCode) {
        super(title, priceCode);
    }

    /**
     * @return Cost of the days rented by all movie.
     */
    @Override
    public double costDaysRented(Rental rental) {
        return rental.getDaysRented() > 2 ? ((rental.getDaysRented() - 2) * 1.5) + 2 : 2;
    }

}
