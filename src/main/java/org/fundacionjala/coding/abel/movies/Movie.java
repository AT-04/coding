package org.fundacionjala.coding.abel.movies;

/**
 * Created by Unknown on 5/26/2017.
 */
abstract class Movie {

    private String title;
    protected double thisAmount;

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
}

/**
 * Created by AbelBarrientos on 5/31/2017.
 */
class Children extends Movie {

    public static final double DEFAULT_INITIAL_AMOUNT = 1.5;
    public static final int MAX_DAYS = 3;

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

/**
 * Created by AbelBarrientos on 5/31/2017.
 */
class Regular extends Movie {

    public static final int DEFAULT_INITIAL_AMOUNT = 2;
    public static final int MAX_DAYS = 2;

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
class NewRelease extends Movie {

    public static final int DEFAULT_INITIAL_AMOUNT = 3;
    private double thisAmount;

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
        thisAmount += daysRented * DEFAULT_INITIAL_AMOUNT;
        return thisAmount;
    }
}
