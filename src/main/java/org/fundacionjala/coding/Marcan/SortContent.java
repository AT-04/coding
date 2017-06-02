package org.fundacionjala.coding.marcan;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * Created by MarcandeaCabrera on 5/23/2017.
 */
public class SortContent {

    public static final int THREE = 3;

    /**
     * The following method is for reverse one word.
     *
     * @param string The test string is sent.
     * @return stringBuilder
     */
    public String sortContent(String string) {
        String[] words = string.split(" ");
        StringJoiner stringJoiner = new StringJoiner(" ");
        stringRound(words, stringJoiner);
        return stringJoiner.toString();
    }

    /**
     * This method is for a round of the word.
     * @param words is the string divided.
     * @param stringJoiner is the result with append.
     */
    private void stringRound(String[] words, StringJoiner stringJoiner) {
        for (String word : words) {
            if (word.length() < THREE) {
                stringJoiner.add(word);
            } else {
                char[] wordInChar = word.substring(1, word.length() - 1).toCharArray();
                Arrays.sort(wordInChar);
                StringBuilder str = new StringBuilder();
                str.append(word.substring(word.length() - 1, word.length()));
                str.append(wordInChar);
                str.append(word.substring(0, 1));
                String reversed = str.reverse().toString();
                stringJoiner.add(reversed);
            }
        }
    }
}
