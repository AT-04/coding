package org.fundacionjala.coding.richardseverich.Movies;

/**
 * Created by RichardSeverich on 5/31/2017.
 */
public class MoviesChildren extends Movie {

    public MoviesChildren(String title, int priceCode) {
        super(title, priceCode);
        thisAmount = 0;
    }

    @Override
    public int generatePrice(int daysRented) {
        thisAmount += 1.5;
        thisAmount += (daysRented > 3) ? (daysRented - 3) * 1.5 : 0;
        return thisAmount;
    }

}


