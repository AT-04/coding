package org.fundacionjala.coding.abel;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by AbelBarrientos on 6/12/2017.
 */
public final class HighestAndLowest {

    /**
     *
     */
    private HighestAndLowest() {

    }

    /** Get the highest and lowest value.
     * @param numbers String.
     * @return String.
     */
    public static String highAndLow(String numbers) {

        IntSummaryStatistics stats = Stream.of(numbers.split(" "))
                .collect(Collectors.summarizingInt(Integer::parseInt));

        return String.format("%d %d", stats.getMax(), stats.getMin());
    }
}
