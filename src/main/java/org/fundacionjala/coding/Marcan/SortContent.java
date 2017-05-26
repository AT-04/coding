package org.fundacionjala.coding.Marcan;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * Created by MarcandeaCabrera on 5/23/2017.
 */
public class SortContent {
    /**
     * The following method is for reverse one word.
     *
     * @param string
     * @return stringBuilder
     */
    public String sortContent(String string) {
        String[] words = string.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            char[] wordInChar = word.substring(1, word.length() - 1).toCharArray();
            Arrays.sort(wordInChar);
            stringBuilder.append(word.substring(word.length() - 1, word.length()));
            stringBuilder.append(wordInChar);
            stringBuilder.append(word.substring(0, 1));

        }
        return stringBuilder.reverse().toString();
    }
}
