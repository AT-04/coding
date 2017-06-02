package org.fundacionjala.coding.abel.movies;

/**
 * Created by AbelBarrientos on 5/31/2017.
 */
class Children extends Movie {

    private static final double DEFAULT_INITIAL_AMOUNT = 1.5;
    private static final int MAX_DAYS = 3;

    /**
     * This is the default constructor.
     * @param title String.
     */
    Children(String title) {
        super(title);
    }

    /**
     * This method calculates the amount for Children movie type.
     * @param daysRented Number of days rented.
     * @return Amount.
     */
    @Override
    public double calculateAmount(int daysRented) {
        thisAmount += DEFAULT_INITIAL_AMOUNT;
        if (daysRented > MAX_DAYS) {
            thisAmount += (daysRented - MAX_DAYS) * DEFAULT_INITIAL_AMOUNT;
        }
        return thisAmount;
    }
}
