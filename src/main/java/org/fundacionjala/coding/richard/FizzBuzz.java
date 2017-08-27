package org.fundacionjala.coding.richard;

/**
 * Created by Administrator on 8/25/2017.
 */
public class FizzBuzz {

    private static final int FIVE = 5;
    private static final int THREE = 3;
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    /**
     * @param number is the number.
     * @return boolean value.
     */
    public boolean isFizz(int number) {
        return number % THREE == 0 || String.valueOf(number).contains(String.valueOf(THREE));
    }

    /**
     * @param number is the number.
     * @return boolean value.
     */
    public boolean isBuzz(int number) {
        return number % FIVE == 0 || String.valueOf(number).contains(String.valueOf(FIVE));
    }

    /**
     * @param number contains of number value.
     * @return Fizz, Buzz or FizzBuzz.
     */
    public String getFizzBuzz(int number) {
        String result = String.valueOf(number);
        if (isFizz(number)) {
            result = FIZZ;
        }
        if (isBuzz(number)) {
            result = BUZZ;
        }
        if (isFizz(number) && isBuzz(number)) {
            result = String.format("%s%s", FIZZ, BUZZ);
        }
        return result;
    }
}
