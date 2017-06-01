package org.fundacionjala.coding.richardseverich.Movies;

public class Movie {

    private String title;
    protected int priceCode;
    protected int thisAmount;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
        thisAmount = 0;
    }
    public int generatePrice(int daysRented) {
        return 0;
    }

    public int generateFrequent(int daysRented){
        return 0;
    }

    public String getTitle() {
        return title;
    }
}
