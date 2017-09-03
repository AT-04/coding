package org.fundacionjala.coding.marcos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Marcos.
 * <p>
 * Given an array of positive or negative integers
 * I= [i1,..,in] you have to produce a sorted array P of the form
 * [ [p, sum of all ij of I for which p is a prime factor (p positive) of ij] ...]
 * P will be sorted by increasing order of the prime numbers. The final result has
 * to be given as a string in Java.
 * Example:
 * I = {12, 15}; // result = "(2 12)(3 27)(5 15)"
 */
public final class SumOfDivided {

    /**
     * Private constructor for the Sum of Divided utility class.
     */
    private SumOfDivided() {

    }

    /**
     * This method calculates and return the string representation of the sum of
     * divided primes.
     *
     * @param numbers the numbers array.
     * @return the result in String representation.
     */
    public static String sumOfDivided(int[] numbers) {
        StringBuilder result = new StringBuilder();
        IntStream.rangeClosed(2, Arrays.stream(numbers).map(Math::abs).sum() / 2).filter(SumOfDivided::isPrime)
                .forEach(n -> result.append(sumMultiples(n, numbers)));
        return result.toString();
    }

    /**
     * This method sum all multiples of a prime number located in the array.
     *
     * @param prime   the prime number.
     * @param numbers the array numbers.
     * @return the string representation result.
     */
    private static String sumMultiples(int prime, int[] numbers) {
        List<Integer> list = Arrays.stream(numbers).filter(n -> n % prime == 0)
                .boxed().collect(Collectors.toList());
        return list.size() != 0
                ? String.format("(%d %d)", prime, list.stream().mapToInt(i -> i).sum()) : "";
    }

    /**
     * This method verifies if a number is prime.
     *
     * @param number number to be evaluated.
     * @return the verification result.
     */
    private static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(number)).allMatch(n -> number % n != 0);
    }
}
