package org.fundacionjala.coding.marcos;

/**
 * Created by Marcos on 8/25/2017.
 * This class return "Fizz" string of multiples of three
 * and "Buzz" of multiples of five.
 */
public final class FizzBuzz {

    private static final int FIVE = 5;
    private static final int THREE = 3;
    private static final int ZERO = 0;
    protected static final String FIZZ = "Fizz";
    protected static final String BUZZ = "Buzz";
    protected static final String FIZZ_BUZZ = "FizzBuzz";

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
        return n % THREE == ZERO || n % FIVE == ZERO || hasThisNumber(n, THREE) || hasThisNumber(n, FIVE)
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
        if (n % THREE == ZERO || hasThisNumber(n, THREE)) {
            stringBuilder.append(FIZZ);
        }
        if (n % FIVE == ZERO || hasThisNumber(n, FIVE)) {
            stringBuilder.append(BUZZ);
        }
        return stringBuilder.toString();
    }

    /**
     * This method check if a number contains a certain digit.
     *
     * @param n     is the number to be evaluated.
     * @param digit is the number to check.
     * @return the find result.
     */
    private static boolean hasThisNumber(int n, int digit) {
        return String.valueOf(n).contains(String.valueOf(digit));
    }
}
