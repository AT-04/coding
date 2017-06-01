package org.fundacionjala.coding.richardseverich.Movies;

/**
 * Created by RichardSeverich on 5/31/2017.
 */
public class MoviesNewRelease extends Movie {

    public MoviesNewRelease(String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    public int generatePrice(int daysRented) {
        thisAmount += daysRented * 3;
        return thisAmount;
    }
}
