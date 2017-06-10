package org.fundacionjala.coding.cynthia.Video;

/**
 * movie class.
 */
public class Children extends Movie {

    /**
     * movie constructor.
     *
     * @param title     movie.
     * @param priceCode movie.
     */
    public Children(String title, int priceCode) {
        super(title, priceCode);
    }

    /**
     * @return Cost of the days rented by all movie.
     */
    @Override
    public double costDaysRented(Rental rental) {
        return rental.getDaysRented() > 2 ? ((rental.getDaysRented() - 3) * 1.5) + 1.5 : 1.5;
    }
}
