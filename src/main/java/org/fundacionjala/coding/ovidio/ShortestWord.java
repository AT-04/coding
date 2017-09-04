package org.fundacionjala.coding.ovidio;

import static java.util.Arrays.stream;

/**
 * Created by Simon on 27/08/2017.
 * Shortest Word.
 * x Simple, given a string of words, return the length of the shortest word(s).
 * <p>
 * String will never be empty and you do not need to account for different data types.
 */
public class ShortestWord {
    /**
     * Find Short.
     *
     * @param s string.
     * @return int.
     */
    public int findShort(String s) {
        return stream(s.split(" ")).mapToInt(x -> x.length()).min().getAsInt();
    }
}
