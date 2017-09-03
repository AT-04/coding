package org.fundacionjala.coding.ovidio;

/**
 * Write a function,persistence,that takes in a positive parameter num and returns
 * its multiplicative persistence,which is the number of times you must multiply the
 * digits in num until you reach a single digit.
 * For example:
 * persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4 and 4 has only one digit
 * <p>
 * persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
 * // 1*2*6 = 12, and finally 1*2 = 2
 * <p>
 * persistence(4) == 0 // because 4 is already a one-digit number
 */

public class Persist {
    /**
     * Function for persistence.
     *
     * @param n positive parameter num.
     * @return returns ts multiplicative persistence.
     */
    public int persistence(long n) {
        int cont = 1;
        while (needsMorePersistence(n) > 9) {
            n = needsMorePersistence(n);
            cont++;
        }
        return cont > 1 ? cont : 0;
    }

    /**
     * Needs more Persistence.
     * @param n number.
     * @return persistence.
     */
    private int needsMorePersistence(long n) {
        int value = 1;
        for (char t : String.valueOf(n).toCharArray()) {
            value *= Integer.parseInt(String.valueOf(t));
        }
        return value;
    }

}
