package org.fundacionjala.coding.ovidio.movies;

/**
 * Created by OvidioMiranda on 6/13/2017.
 */
public class ChildrensPrice extends Price {

    public static final double DOUBLE = 1.5;
    public static final int INT = 3;

    @Override
    public int getPriceCode() {
        return Movie.CHILDREN;
    }

    @Override
    double getCharge(int daysRented) {
        double amount = DOUBLE;
        if (daysRented > INT) {
            amount += (daysRented - INT) * DOUBLE;
        }
        return amount;
    }
}
