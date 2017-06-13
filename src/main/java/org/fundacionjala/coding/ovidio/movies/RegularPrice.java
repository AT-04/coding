package org.fundacionjala.coding.ovidio.movies;

/**
 * Created by OvidioMiranda on 6/13/2017.
 */
public class RegularPrice extends Price {

    public static final double DOUBLE = 1.5;
    public static final int TWO = 2;

    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    public double getCharge(int daysRented) {
        double amount = TWO;
        if (daysRented > TWO) {
            amount += (daysRented - TWO) * DOUBLE;
        }
        return amount;
    }
}
