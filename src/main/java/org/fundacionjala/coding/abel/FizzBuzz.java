package org.fundacionjala.coding.abel;

/**
 * Kata Fizz Buzz.
 */
public final class FizzBuzz {

    /**
     * Private Constructor.
     */
    private FizzBuzz() {

    }

    /**
     * Print number to N.
     *
     * @param until that number.
     */
    public static void printNumbers(int until) {
        for (int i = 1; i <= until; i++) {
            String fizzBuzz = fizzBuzzOf(i);
            System.out.println(fizzBuzz);
        }
    }

    /**
     * Get the Fizz Buzz Value of number.
     *
     * @param number The Integer value.
     * @return The Fizz Buzz Value.
     */
    public static String fizzBuzzOf(int number) {
        boolean modThree = number % 3 == 0;
        boolean modFive = number % 5 == 0;
        String stringValue = String.valueOf(number);
        boolean containsThree = stringValue.contains("3");
        boolean containsFive = stringValue.contains("5");
        if (!modThree && !modFive && !containsThree && !containsFive) {
            return stringValue;
        }
        StringBuilder sb = new StringBuilder();
        if (modThree || containsThree) {
            sb.append("Fizz");
        }
        if (modFive || containsFive) {
            sb.append("Buzz");
        }
        return sb.toString();
    }
}
