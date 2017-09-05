package org.fundacionjala.coding.marcos;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Marcos.
 */
public final class Frequent {

    private static final int ZERO = 0;

    /**
     * Private constructor for the Frecuent utility class.
     */
    private Frequent() {

    }

    /**
     * This method return the number of elements of most frequent item in a int array.
     *
     * @param numbers the numbers array.
     * @return the number of the most frequent item.
     */
    public static int mostFrequentItemCount(int[] numbers) {
        Stream<Integer> streamWithoutRepetitions = Arrays.stream(numbers).boxed().distinct();
        return streamWithoutRepetitions.map(n -> countNumber(n, numbers)).max(Integer::compare).orElse(ZERO);
    }

    /**
     * This method return the number of elements of a number in the array.
     *
     * @param i       the specified number.
     * @param numbers the array number.
     * @return the number of ocurrencies.
     */
    private static Integer countNumber(int i, int[] numbers) {
        return (int) Arrays.stream(numbers).filter(n -> n == i).count();
    }
}
