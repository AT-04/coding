package org.fundacionjala.coding.richardseverich.movies;

/**
 * Created by RichardSeverich on 5/31/2017.
 */
abstract class Movie {

    private String title;
    protected static final int ONE = 1;
    protected static final int TWO = 2;
    public static final double ONE_FIVE = 1.5;
    public static final int TREE = 3;

    /**
     * @param title is the title of movie.
     */
    Movie(String title) {
        this.title = title;
    }

    /**
     * @param daysRented Is the variable that keeps the days rented.
     * @return Returns zero.
     */
    public abstract int generatePrice(int daysRented);


    /**
     * @param daysRented Is the variable that keeps the days rented.
     * @return Returns zero.
     */
    public abstract int generateFrequent(int daysRented);


    /**
     * @return Returns title of movie.
     */
    public String getTitle() {
        return title;
    }
}
