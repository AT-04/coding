package org.fundacionjala.coding.cynthia;

/**
 * Created by Cynthia on 8/25/2017.
 */
public class FizzBuzz {
    private static final int FIVE = 5;
    private static final int THREE = 3;
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = "FizzBuzz";

    /**
     * @param num value for check.
     * @return res answer.
     */
    public String isFizzBuzz(int num) {
        String res;
        if (num % THREE == 0 || num % FIVE == 0) {
            res = (num % THREE == 0) ? FIZZ : BUZZ;
        } else {
            res = Integer.toString(num);
        }
        if (num % THREE == 0 && num % FIVE == 0) {
            res = FIZZ_BUZZ;
        }
        return res;
    }
}
