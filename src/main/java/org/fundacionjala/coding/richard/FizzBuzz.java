package org.fundacionjala.coding.richard;

/**
 * Created by Administrator on 8/25/2017.
 */
public class FizzBuzz {

    /**
     * @param number is the number.
     * @return boolean value.
     */
    public boolean isFizz(int number) {
        return number % 3 == 0 || String.valueOf(number).contains("3");
    }

    /**
     * @param number is the number.
     * @return boolean value.
     */
    public boolean isBuzz(int number) {
        return number % 5 == 0 || String.valueOf(number).contains("5");
    }

    /**
     * @param number contains of number value.
     * @return Fizz, Buzz or FizzBuzz.
     */
    public String getFizzBuzz(int number) {
        StringBuilder result = new StringBuilder();
        result.append(number);
        if (isFizz(number)) {
            result.setLength(0);
            result.append("Fizz");
        }
        if (isBuzz(number)) {
            result.setLength(0);
            result.append("Buzz");
        }
        if (isFizz(number) && isBuzz(number)) {
            result.setLength(0);
            result.append("FizzBuzz");
        }
        return result.toString();
    }
}
