package org.fundacionjala.coding.ovidio.movies;

/**
 * Created by OvidioMiranda on 6/13/2017.
 */
public abstract class Price {
    /**
     * @return int.
     */
    abstract int getPriceCode();

    /**
     * @param daysRented day.
     * @return double.
     */
    abstract double getCharge(int daysRented);

    /**
     * @param daysRented day.
     * @return int.
     */
    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
