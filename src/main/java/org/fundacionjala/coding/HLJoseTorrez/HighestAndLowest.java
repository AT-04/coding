package org.fundacionjala.coding.HLJoseTorrez;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by JoseTorrez on 6/12/2017.
 */
public final class HighestAndLowest {

    /**
     * Constructor.
     */
    private HighestAndLowest() {

    }

    /**
     * Method to get the highest and lowest number.
     * @param getString received.
     * @return String.
     */
    public static String getHightAndLow(String getString) {

        List<Integer> numbers = Arrays.stream(getString.split(" "))
                .map(Integer::valueOf).collect(Collectors.toList());
        return String.format("%d %d", Collections.max(numbers), Collections.min(numbers));
    }
}
