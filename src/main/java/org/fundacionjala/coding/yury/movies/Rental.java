package main.java.org.fundacionjala.coding.yury.movies;

/**
 *
 */
public class Rental {
    private Movie movie;
    private int daysRented;
    private static final int NUMBER = 3;
    private static final int NUMBER_DAY = 3;

    /**
     * @param movie      Title of movie
     * @param daysRented day rents
     */
    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * @return day rents
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * @return title of movie
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * @param each class
     * @param thisAmount mount for loan
     * @return mount for loan
     */
    public double getThisAmount(Rental each, double thisAmount) {
        if (Movie.REGULAR == each.getMovie().getPriceCode()) {
            thisAmount += each.getDaysRented() > 2 ? (each.getDaysRented() - 2) * NUMBER_DAY : 2;
        }
        if (Movie.NEW_RELEASE == each.getMovie().getPriceCode()) {
            thisAmount += each.getDaysRented() * NUMBER;
        }
        if (Movie.CHILDRENS == each.getMovie().getPriceCode()) {
            thisAmount += each.getDaysRented() > NUMBER ? (each.getDaysRented() - NUMBER) * NUMBER_DAY : NUMBER_DAY;
        }
        return thisAmount;
    }

}

