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
     * @param string The test string is sent.
     * @return stringBuilder
     */
    public String sortContent(String string) {
        String[] words = string.split(" ");
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (String word : words) {
            char[] wordInChar = word.substring(1, word.length() - 1).toCharArray();
            Arrays.sort(wordInChar);
            StringBuilder str = new StringBuilder();
            str.append(word.substring(word.length() - 1, word.length()));
            str.append(wordInChar);
            str.append(word.substring(0, 1));
            String reversed = str.reverse().toString();
            stringJoiner.add(reversed);
        }
        return stringJoiner.toString();
    }
}
