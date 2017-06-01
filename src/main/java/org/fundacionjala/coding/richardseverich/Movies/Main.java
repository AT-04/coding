package org.fundacionjala.coding.richardseverich.Movies;

/**
 * Created by RichardSeverich on 6/1/2017.
 */
final class Main {

    /**
     *
     */
    private Main() {
    }

    /**
     * @param args this is an argument.
     */
    public static void main(String[] args) {
        Customer customer = new Customer("Richard Severich");
        customer.addRental(new Rental(new MoviesNewRelease("Pelicula Estreno"), 2));
        customer.addRental(new Rental(new MoviesRegular("Pelicula Regular"), 2));
        System.out.println(customer.statement());
    }
}
