package org.fundacionjala.coding.richardseverich.Movies;

class Rental {
    private Movie movie;
    private int daysRented;
    public int frequentRenterPoints = 0;

    public Rental(Movie movie, int daysRented) {

        this.movie = movie;
        this.daysRented = daysRented;
        frequentRenterPoints= movie.generateFrequent(daysRented);
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }

}