package org.fundacionjala.coding.richardseverich.Movies;

/**
 * Created by RichardSeverich on 5/31/2017.
 */
public class MoviesNewRelease extends Movie {

    public static final int TREE = 3;

    /**
     * @param title is the title of movie.
     */
    public MoviesNewRelease(String title) {
        super(title);
    }

    /**
     * @param daysRented is the variable that keeps the days rented.
     * @return It is the amount to pay for the movie rented.
     */
    @Override
    public int generatePrice(int daysRented) {
        thisAmount += daysRented * TREE;
        return thisAmount;
    }
}
