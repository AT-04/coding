package org.fundacionjala.coding;

import java.util.StringJoiner;

/**
 * Created by MarcandeaCabrera on 5/19/2017.
 */

public class SpinWord {
    public static final int LENGTH_REVERSE = 5;

    /**
     * Reverse Word major to five character.
     * @param string that is to the return.
     * @return String
     */
    public String reverseWord(String string) {
        String[] auxWord = string.split(" ");
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (String word : auxWord) {
            if (word.length() > LENGTH_REVERSE) {
                stringJoiner.add(new StringBuffer(word).reverse());
            } else {
                stringJoiner.add(word);
            }
        }
        return stringJoiner.toString();
    }
}
