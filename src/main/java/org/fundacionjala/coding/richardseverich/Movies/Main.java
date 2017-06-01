package org.fundacionjala.coding.richardseverich.Movies;

public class Main {
    public static void main(String[] args)
    {

        Customer customer = new Customer("Richard Severich");
        Movie movie = new MoviesNewRelease("Pelicula Estreno", 1);
        Movie moviee = new MoviesRegular("Pelicula Regular", 0);

        customer.addRental(new Rental(movie, 2));
        customer.addRental(new Rental(moviee, 2));

        System.out.println(customer.statement());
    }
}
