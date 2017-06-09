package org.fundacionjala.coding.abel.movies;

/**
 * Created by AbelBarrientos on 5/31/2017.
 */
class NewRelease extends Movie {

    private static final int DEFAULT_INITIAL_AMOUNT = 3;

    /**
     * This is the default constructor.
     * @param title String.
     */
    NewRelease(String title) {
        super(title);
    }

    /**
     * This method calculates the amount for New Release movie type.
     * @param daysRented Number of days rented.
     * @return Amount.
     */
    @Override
    public double calculateAmount(int daysRented) {
        return daysRented * DEFAULT_INITIAL_AMOUNT;
    }

    /**
     * This method calculates the frequent renter points for New Release.
     * @return Frequent Renter Points.
     */
    @Override
    public int calculateFrequentRenterPoints(int daysRented) {
        return daysRented > 1 ? DEFAULT_FREQUENT_RENTER_POINTS + 1 : DEFAULT_FREQUENT_RENTER_POINTS;
    }
}
