package org.fundacionjala.coding.marcoslara.highestandlowest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Marcos on 12-06-2017.
 */
public final class HighestAndLowest {
    /**
     * Private constructor required. These kind of classes are more like tools/utilities than being meant for objects.
     */
    private HighestAndLowest() {

    }

    /**
     * Main method that find the highest and lowest values of a numbers group.
     *
     * @param input String with the group of numbers.
     * @return A string with the highest and lowest values.
     */
    public static String highAndLow(String input) {
        List<Integer> numbers = Arrays.stream(input.split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        return String.format("%d %d", Collections.max(numbers), Collections.min(numbers));
    }
}
