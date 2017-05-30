package org.fundacionjala.coding.richard.severich.spinwords;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by RichardSeverich on 5/22/2017.
 */
public class SpinWords {

    public static final int REV = 5;

    /**
     * This is the method that overturns strings that are more than 4 characters long.
     *
     * @param spinWord It is the initial string.
     * @return Is the final string.
     */
    public String spin(String spinWord) {
        return Stream.of(spinWord.split(" "))
                .map(word -> (word.length() >= REV) ? new StringBuilder(word).reverse().toString() : word)
                .collect(Collectors.joining(" "));
    }
}
