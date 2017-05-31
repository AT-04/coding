package org.fundacionjala.coding.richard.movies;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Richard Severich");
        customer.addRental(new Rental(new Movie("Pelicula Estreno", 1), 2));
        customer.addRental(new Rental(new Movie("Pelicula Niños", 0), 2));
        System.out.println(customer.statement());
    }
}
