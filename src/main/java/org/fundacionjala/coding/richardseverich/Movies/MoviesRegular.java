package org.fundacionjala.coding.richardseverich.Movies;

/**
 * Created by RichardSeverich on 5/31/2017.
 */
public class MoviesRegular extends Movie {

    public MoviesRegular(String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    public int generatePrice(int daysRented) {
        thisAmount += 2;
        thisAmount += (daysRented > 2) ? (daysRented - 2) * 1.5 : 0;
        return thisAmount;
    }

    @Override
    public int generateFrequent(int daysRented){
        int frequentRenterPoints=0;
        frequentRenterPoints += (daysRented > 1) ? 1 : 0;
        return   frequentRenterPoints;
    }


}
