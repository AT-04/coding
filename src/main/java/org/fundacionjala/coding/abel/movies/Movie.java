package org.fundacionjala.coding.abel.movies;

/**
 * Created by Unknown on 5/26/2017.
 */
abstract class Movie {

    private String title;

    /**
     * This is the default constructor.
     * @param title String.
     */
    Movie(String title) {
        this.title = title;
    }

    /**
     * Getter for Title.
     * @return String Title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method calculates the amount for Movie.
     * @param daysRented Number of days rented.
     * @return Amount.
     */
    public abstract double calculateAmount(int daysRented);

    /**
     * This method calculates the frequent renter points for Movie.
     * @return Frequent Renter Points.
     */
    public abstract int calculateFrequentRenterPoints();
}
