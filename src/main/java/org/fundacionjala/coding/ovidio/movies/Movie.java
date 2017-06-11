package org.fundacionjala.coding.ovidio.movies;


/**
 * The class for Movie.
 */
public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private int priceCode;

    /***
     *
     * @param title a tittle.
     * @param priceCode receive a price code.
     */
    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    /**
     * @return price code.
     */
    public int getPriceCode() {
        return priceCode;
    }

    /**
     * @param arg receive price code.
     */
    public void setPriceCode(int arg) {
        priceCode = arg;
    }

    /**
     * @return title.
     */
    public String getTitle() {
        return title;
    }
}
