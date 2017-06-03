package org.fundacionjala.coding.richardseverich.movies;

/**
 * Created by RichardSeverich on 5/31/2017.
 */
public class MoviesChildren extends Movie {

    /**
     * @param title is the title of movie.
     */
    public MoviesChildren(String title) {
        super(title);
        thisAmount = 0;
    }

    /**
     * @param daysRented Is the variable that keeps the days rented.
     * @return It is the amount to pay for the movie rented.
     */
    @Override
    public int generatePrice(int daysRented) {
        thisAmount += ONE_FIVE;
        thisAmount += (daysRented > TREE) ? (daysRented - TREE) * ONE_FIVE : 0;
        return thisAmount;
    }
}
