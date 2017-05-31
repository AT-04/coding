package org.fundacionjala.coding.abel.movies;

/**
 * Created by Unknown on 5/26/2017.
 */
public class Movie {

    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private int priceCode;

    /**
     * This is the default constructor.
     * @param title String.
     * @param priceCode int.
     */
    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    /**
     * Getter for PriceCode.
     * @return Integer Price Code.
     */
    public int getPriceCode() {
        return priceCode;
    }

    /**
     * Getter for Title.
     * @return String Title.
     */
    public String getTitle() {
        return title;
    }
}
