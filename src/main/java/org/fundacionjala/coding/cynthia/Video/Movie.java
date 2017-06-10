package org.fundacionjala.coding.cynthia.Video;

/**
 * movie class.
 */
abstract class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String titleMovie;
    private int priceCodeMovie;

    /**
     * movie constructor.
     * @param title movie.
     * @param priceCode movie.
     */
    Movie(String title, int priceCode) {
        titleMovie = title;
        priceCodeMovie = priceCode;
    }

    /**
     * @return price code of the movie.
     */
    public int getPriceCode() {
        return priceCodeMovie;
    }

    /**
     * @param arg set the price code for the movie.
     */
    public void setPriceCode(int arg) {
        priceCodeMovie = arg;
    }

    /**
     * @return the title for the movie.
     */
    public String getTitle() {
        return titleMovie;
    }

    /**
     *
     * @param rental to get the cost of days rented by movie.
     * @return cost days by movies rented.
     */
    public abstract  double costDaysRented(Rental rental);
}
