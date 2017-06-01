package org.fundacionjala.coding.abel.movies;

/**
 * Created by Unknown on 5/26/2017.
 */
final class Main {

    /**
     *
     */
    private Main() {
    }
    /**
     * The main method.
     * @param args Args.
     */
    public static void main(String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Movie("The Revenant", 1), 2));
        customer.addRental(new Rental(new Movie("Terminator", 0), 2));
        System.out.println(customer.statement());
    }
}
