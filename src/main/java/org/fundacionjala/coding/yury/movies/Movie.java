package org.fundacionjala.coding.yury.movies;

/**
 *
 */
public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private int priceCode;

    /**
     * @param title     title of movie
     * @param priceCode cost of the movie
     */
    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    /**
     * @return cots of code
     */
    public int getPriceCode() {
        return priceCode;
    }

    /**
     * @return title of movie
     */
    public String getTitle() {
        return title;
    }

}
