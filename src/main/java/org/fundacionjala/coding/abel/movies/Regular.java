package org.fundacionjala.coding.abel.movies;

/**
 * Created by AbelBarrientos on 5/31/2017.
 */
class Regular extends Movie {

    private static final int DEFAULT_INITIAL_AMOUNT = 2;
    private static final int MAX_DAYS = 2;

    /**
     * This is the default constructor.
     * @param title String.
     */
    Regular(String title) {
        super(title);
    }

    /**
     * This method calculates the amount for Regular movie type.
     * @param daysRented Number of days rented.
     * @return Amount.
     */
    @Override
    public double calculateAmount(int daysRented) {
        double thisAmount = DEFAULT_INITIAL_AMOUNT;
        if (daysRented > MAX_DAYS) {
            thisAmount += (daysRented - MAX_DAYS) * DEFAULT_INITIAL_AMOUNT;
        }
        return thisAmount;
    }


    /**
     * This method calculates the frequent renter points for Regular.
     * @param daysRented Number of days rented.
     * @return Frequent Renter Points.
     */
    @Override
    public int calculateFrequentRenterPoints(int daysRented) {
        return DEFAULT_FREQUENT_RENTER_POINTS;
    }
}
