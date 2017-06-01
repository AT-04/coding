package org.fundacionjala.coding.richardseverich.Movies;

/**
 * Created by RichardSeverich on 5/31/2017.
 */
public class MoviesRegular extends Movie {


    /**
     * @param title  is the title of movie.
     */
    public MoviesRegular(String title) {
        super(title);
    }

    /**
     * @param daysRented Is the variable that keeps the days rented.
     * @return It is the amount to pay for the movie rented.
     */
    @Override
    public int generatePrice(int daysRented) {
        thisAmount += TWO;
        thisAmount += (daysRented > TWO) ? (daysRented - TWO) * ONE_FIVE : 0;
        return thisAmount;
    }

    /**
     * @param daysRented Is the variable that keeps the days rented.
     * @return It is the frequent points.
     */
    @Override
    public int generateFrequent(int daysRented) {
        int frequentRenterPoints = 0;
        frequentRenterPoints += (daysRented > 1) ? 1 : 0;
        return frequentRenterPoints;
    }


}
