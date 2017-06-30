package org.fundacionjala.coding.richard.movies;

/**
 * Created by RichardSeverich on 5/31/2017.
 */
public class MoviesRegular extends Movie {

    /**
     * @param title is the title of movie.
     */
    public MoviesRegular(String title) {
        super(title);
    }

    /**
     * @param daysRented Is the variable that keeps the days rented.
     * @return It is the amount to pay for the movie rented.
     */
    @Override
    public double generatePrice(int daysRented) {
        return daysRented > TWO ? TWO + (daysRented - TWO) * ONE_FIVE : TWO;
    }

    /**
     * @param daysRented Is the variable that keeps the days rented.
     * @return It is the frequent points.
     */
    @Override
    public int generateFrequent(int daysRented) {
        return daysRented > 1 ? TWO : ONE;
    }
}
