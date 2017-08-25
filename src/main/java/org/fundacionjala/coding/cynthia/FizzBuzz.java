package org.fundacionjala.coding.cynthia;

/**
 * Created by Cynthia on 8/25/2017.
 */
public class FizzBuzz {
    /**
     * @param num value for check.
     * @return res answer.
     */
    public String isFizz(int num) {
        String res = "";
        if (num % 3 == 0 || num % 5 == 0) {
            res = (num % 3 == 0) ? "Fizz" : "Buzz";
        } else {
            res = Integer.toString(num);
        }

        if (num % 3 == 0 && num % 5 == 0) {
            res = "FizzBuzz";
        }
        return res;
    }
}
