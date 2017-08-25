package org.fundacionjala.coding.ovidio;

import java.util.ArrayList;

/**
 * Created by OvidioMiranda on 8/25/2017.
 */
public class FizzBuzz {
    private ArrayList<String> number;

    /**
     *
     */
    public FizzBuzz() {
        number = new ArrayList<>();
    }

    /**
     * FizzBuzzOf.
     * @param number int.
     * @return string.
     */
    public String fizzBuzzOf(int number) {
        boolean modThree = number % 3 == 0;
        boolean modFive = number % 5 == 0;
        if (modThree && modFive) {
            return "FizzBuzz";
        }
        return modThree ? "Fizz" : modFive ? "Buzz" : Integer.toString(number);
    }


    /**
     * Print Numbers for Game.
     *
     * @param until int.
     */
    public void printNumbers(int until) {
        for (int i = 1; i <= until; i++) {
            number.add(fizzBuzzOf(i));
        }
    }

    /**
     * Counter.
     *
     * @param name String.
     * @return int.
     */
    public int counter(String name) {
        int count = 0;
        for (String c : number) {
            if (c.equals(name)) {
                count++;
            }
        }
        return count;
    }
}
