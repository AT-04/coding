package org.fundacionjala.coding.abel.movies;

/**
 * Created by AbelBarrientos on 5/31/2017.
 */
abstract class AbstractMovieType {
    /**
     * This method calculates the amount for movie type.
     * @param daysRented Number of days rented.
     * @return Amount.
     */
    public abstract double calculateAmount(int daysRented);
}

/**
 * Created by AbelBarrientos on 5/31/2017.
 */
class Children extends AbstractMovieType {

    public static final double DEFAULT_INITIAL_AMOUNT = 1.5;
    public static final int MAX_DAYS = 3;
    private double thisAmount;

    /**
     * Constructor.
     */
    Children() {
        thisAmount = 0;
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

/**
 * Created by AbelBarrientos on 5/31/2017.
 */
class Regular extends AbstractMovieType {

    public static final int DEFAULT_INITIAL_AMOUNT = 2;
    public static final int MAX_DAYS = 2;
    private double thisAmount;

    /**
     * Constructor.
     */
    Regular() {
        thisAmount = 0;
    }

    /**
     * This method calculates the amount for Regular movie type.
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

/**
 * Created by AbelBarrientos on 5/31/2017.
 */
class NewRelease extends AbstractMovieType {

    public static final int DEFAULT_INITIAL_AMOUNT = 3;
    private double thisAmount;

    /**
     * Constructor.
     */
    NewRelease() {
        thisAmount = 0;
    }

    /**
     * This method calculates the amount for New Release movie type.
     * @param daysRented Number of days rented.
     * @return Amount.
     */
    @Override
    public double calculateAmount(int daysRented) {
        thisAmount += daysRented * DEFAULT_INITIAL_AMOUNT;
        return thisAmount;
    }
}
