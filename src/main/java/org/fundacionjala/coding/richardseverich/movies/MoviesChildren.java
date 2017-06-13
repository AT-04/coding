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
    }

    /**
     * @param daysRented Is the variable that keeps the days rented.
     * @return It is the amount to pay for the movie rented.
     */
    @Override
    public int generatePrice(int daysRented) {
        return (int) ((daysRented > TREE) ? ONE_FIVE + (daysRented - TREE) * ONE_FIVE : ONE_FIVE);
    }

    /**
     * @param daysRented Is the variable that keeps the days rented.
     * @return
     */
    @Override
    public int generateFrequent(int daysRented) {
        return ONE;
    }
}
