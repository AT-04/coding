package org.fundacionjala.coding.ovidio.movies;


/**
 * The class for Movie.
 */

public class Movie {
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private Price price;

    /**
     * @param title     title.
     * @param priceCode priceCode.
     */
    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    /**
     * @return title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param priceCode price.
     */
    private void setPriceCode(int priceCode) {
        switch (priceCode) {
            case CHILDREN:
                price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            case REGULAR:
                price = new RegularPrice();
                break;
            default:
                throw new IllegalArgumentException("invalid price code");
        }
    }

    /**
     * @return price.
     */
    private int getPriceCode() {
        return price.getPriceCode();
    }

    /**
     * @param daysRented days.
     * @return double.
     */
    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    /**
     * @param daysRented days.
     * @return int.
     */
    public int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }

}
