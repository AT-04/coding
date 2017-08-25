package org.fundacionjala.coding.marcoslara;

/**
 * Created by Marcos on 8/25/2017.
 * This class return "Fizz" string of multiples of three
 * and "Buzz" of multiples of five.
 */
public final class FizzBuzz {

    public static final int FIVE = 5;
    public static final int THREE = 3;

    /**
     * Private constructor for the utility class.
     */
    private FizzBuzz() {

    }

    /**
     * This method return the representation of a number based on the rules
     * described.
     *
     * @param n is the number to be evaluated.
     * @return the number representation.
     */
    public static String printNumber(int n) {
        return n % 3 == 0 || n % 5 == 0 || isContaining(n, THREE) || isContaining(n, FIVE)
                ? printWord(n) : String.valueOf(n);
    }

    /**
     * This method return the representation of numbers multiples of three and five.
     *
     * @param n is the number to be evaluated.
     * @return the string representation based in the multiples.
     */
    private static String printWord(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        if (n % 3 == 0 || isContaining(n, 3)) {
            stringBuilder.append("Fizz");
        }
        if (n % 5 == 0 || isContaining(n, 5)) {
            stringBuilder.append("Buzz");
        }
        return stringBuilder.toString();
    }

    /**
     * This method find a digit in a number.
     *
     * @param n     is the number to be evaluated.
     * @param digit is the number to find.
     * @return the find result.
     */
    private static boolean isContaining(int n, int digit) {
        while (n > 0) {
            if (n % 10 == digit) {
                return true;
            }
            n = n / 10;
        }
        return false;
    }
}
