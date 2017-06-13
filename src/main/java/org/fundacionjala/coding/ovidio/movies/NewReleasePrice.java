package org.fundacionjala.coding.ovidio.movies;

/**
 * Created by OvidioMiranda on 6/13/2017.
 */
public class NewReleasePrice extends Price {

    public static final int THREE = 3;
    public static final int ONE = 1;
    public static final int TWO = 2;

    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int daysRented) {
        return daysRented * THREE;
    }

    @Override
    int getFrequentRenterPoints(int daysRented) {
        if (daysRented > ONE) {
            return TWO;
        }
        return ONE;
    }
}
